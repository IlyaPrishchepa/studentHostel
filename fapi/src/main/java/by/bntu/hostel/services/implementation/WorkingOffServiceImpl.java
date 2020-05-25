package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.WorkingOff;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.WorkingOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class WorkingOffServiceImpl implements WorkingOffService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public WorkingOffServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public WorkingOff create(WorkingOff workingOff) {
        return restTemplate.postForObject(backendApiProperties.getWorkingOffUri(),workingOff,WorkingOff.class);
    }

    @Override
    public WorkingOff findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getWorkingOffUri()+"/"+id, WorkingOff.class);
    }

    @Override
    public List<WorkingOff> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getWorkingOffUri()
                +"/find-all/?pageNo="+page+"&pageSize="+size, WorkingOff[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getWorkingOffUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getWorkingOffUri()+"/size", Integer.class);
    }

    @Override
    public WorkingOff findByStudentID(int id) {
        return restTemplate.getForObject(backendApiProperties.getWorkingOffUri() +
                "/find-by-StudentId/" + id, WorkingOff.class);
    }
}
