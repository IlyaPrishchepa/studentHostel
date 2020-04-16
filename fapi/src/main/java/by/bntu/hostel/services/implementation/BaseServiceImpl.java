package by.bntu.hostel.services.implementation;

import by.bntu.hostel.config.Constants;
import by.bntu.hostel.config.JwtTokenProvider;
import by.bntu.hostel.entity.Base;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("baseService")
public class BaseServiceImpl implements BaseService{

    @Autowired
    private BackendApiProperties backendApiProperties;

    @Autowired
    private BCryptPasswordEncoder bcryptEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;


    private final RestTemplate restTemplate;

    public BaseServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Base create(Base base) {
        base.setPassword(bcryptEncoder.encode(base.getPassword()));
        return restTemplate.postForObject(backendApiProperties.getBaseUri(),base,Base.class);
    }

    @Override
    public Base findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getBaseUri()+"/"+id, Base.class);
    }

    @Override
    public List<Base> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getBaseUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, Base[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getBaseUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getBaseUri()+"/size", Integer.class);
    }

    @Override
    public Base findByLoginAndEmail(String login, String password) {
        return restTemplate.getForObject(backendApiProperties.getBaseUri()
                +"/?login="+ login + "&password=" + password, Base.class);
    }

    @Override
    public Base findByLogin(String login) {
        return restTemplate.getForObject(backendApiProperties.getBaseUri()
                +"/find-by-login/" + login, Base.class);
    }

    @Override
    public UserDetails loadBaseByLogin(String login) throws UsernameNotFoundException {
        Base base = findByLogin(login);
        if(base == null){
            throw new UsernameNotFoundException("Invalid login!");
        }
        return new User(base.getLogin(), base.getPassword(), getAuthority(base));
    }

    private Set<SimpleGrantedAuthority> getAuthority(Base base) {
        Set<SimpleGrantedAuthority> authorities = new HashSet();
        authorities.add(new SimpleGrantedAuthority(base.getRoleId().getName()));
        return authorities;
    }



    public String getLogin(String bearerToken) {
        String login = null;
        String authToken = bearerToken.replace(Constants.TOKEN_PREFIX, "");
        try {
            login = jwtTokenProvider.getUsernameFromToken(authToken);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return login;
    }
}
