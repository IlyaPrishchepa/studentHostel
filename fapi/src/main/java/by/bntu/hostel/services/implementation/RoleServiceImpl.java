package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Role;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public RoleServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Role create(Role role) {
        return restTemplate.postForObject(backendApiProperties.getRoleUri(),role,Role.class);
    }

    @Override
    public Role findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getRoleUri()+"/"+id, Role.class);
    }

    @Override
    public List<Role> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getRoleUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, Role[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getRoleUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getRoleUri()+"/size", Integer.class);
    }
}
