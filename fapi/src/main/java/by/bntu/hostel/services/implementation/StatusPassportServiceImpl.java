package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StatusPassport;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StatusPassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StatusPassportServiceImpl implements StatusPassportService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StatusPassportServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public StatusPassport create(StatusPassport statusPassport) {
        return restTemplate.postForObject(backendApiProperties.getStatusPassportUri(),statusPassport,StatusPassport.class);
    }

    @Override
    public StatusPassport findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStatusPassportUri()+"/"+id, StatusPassport.class);
    }

    @Override
    public List<StatusPassport> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStatusPassportUri()
                +"/find-all/?pageNo="+page+"&pageSize="+size, StatusPassport[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStatusPassportUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStatusPassportUri()+"/size", Integer.class);
    }
    
}
