package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Duty;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public DutyServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Duty create(Duty duty) {
        return restTemplate.postForObject(backendApiProperties.getDutyUri(),duty,Duty.class);
    }

    @Override
    public Duty findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getDutyUri()+"/"+id, Duty.class);
    }

    @Override
    public List<Duty> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getDutyUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, Duty[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getDutyUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getDutyUri()+"/size", Integer.class);
    }
}
