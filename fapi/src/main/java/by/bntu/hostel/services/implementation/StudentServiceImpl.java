package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Student;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StudentServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Student create(Student student) {
        return restTemplate.postForObject(backendApiProperties.getStudentUri(),student,Student.class);
    }

    @Override
    public Student findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStudentUri()+"/"+id, Student.class);
    }

    @Override
    public List<Student> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStudentUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, Student[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStudentUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStudentUri()+"/size", Integer.class);
    }
}
