package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StudentReprimand;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StudentReprimandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentReprimandServiceImpl implements StudentReprimandService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StudentReprimandServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public StudentReprimand create(StudentReprimand studentReprimand) {
        return restTemplate.postForObject(backendApiProperties.getStudentReprimandUri(),studentReprimand,StudentReprimand.class);
    }

    @Override
    public StudentReprimand findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStudentReprimandUri()+"/"+id, StudentReprimand.class);
    }

    @Override
    public List<StudentReprimand> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStudentReprimandUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, StudentReprimand[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStudentReprimandUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStudentReprimandUri()+"/size", Integer.class);
    }
}
