package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StudentPayment;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StudentPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentPaymentServiceImpl implements StudentPaymentService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StudentPaymentServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public StudentPayment create(StudentPayment studentPayment) {
        return restTemplate.postForObject(backendApiProperties.getStudentPaymentUri(),studentPayment,StudentPayment.class);
    }

    @Override
    public StudentPayment findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStudentPaymentUri()+"/"+id, StudentPayment.class);
    }

    @Override
    public List<StudentPayment> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStudentPaymentUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, StudentPayment[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStudentPaymentUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStudentPaymentUri()+"/size", Integer.class);
    }
}
