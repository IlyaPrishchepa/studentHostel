package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.DutyType;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.DutyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DutyTypeServiceImpl implements DutyTypeService {
    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public DutyTypeServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public DutyType create(DutyType dutyType) {
        return restTemplate.postForObject(backendApiProperties.getDutyTypeUri(),dutyType,DutyType.class);
    }

    @Override
    public DutyType findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getDutyTypeUri()+"/"+id, DutyType.class);
    }

    @Override
    public List<DutyType> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getDutyTypeUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, DutyType[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getDutyTypeUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getDutyTypeUri()+"/size", Integer.class);
    }
}
