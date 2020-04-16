package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Payment;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public PaymentServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Payment create(Payment payment) {
        return restTemplate.postForObject(backendApiProperties.getPaymentUri(),payment,Payment.class);
    }

    @Override
    public Payment findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getPaymentUri()+"/"+id, Payment.class);
    }

    @Override
    public List<Payment> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getPaymentUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, Payment[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getPaymentUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getPaymentUri()+"/size", Integer.class);
    }
}
