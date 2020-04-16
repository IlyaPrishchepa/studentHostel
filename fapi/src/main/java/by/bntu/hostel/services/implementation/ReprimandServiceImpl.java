package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Reprimand;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.ReprimandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ReprimandServiceImpl implements ReprimandService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public ReprimandServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Reprimand create(Reprimand reprimand) {
        return restTemplate.postForObject(backendApiProperties.getReprimandUri(),reprimand,Reprimand.class);
    }

    @Override
    public Reprimand findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getReprimandUri()+"/"+id, Reprimand.class);
    }

    @Override
    public List<Reprimand> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getReprimandUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, Reprimand[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getReprimandUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getReprimandUri()+"/size", Integer.class);
    }
}
