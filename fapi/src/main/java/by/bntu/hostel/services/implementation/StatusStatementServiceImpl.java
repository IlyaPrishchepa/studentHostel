package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StatusStatement;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StatusStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StatusStatementServiceImpl implements StatusStatementService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StatusStatementServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public StatusStatement create(StatusStatement statusStatement) {
        return restTemplate.postForObject(backendApiProperties.getStatusStatementUri(),statusStatement,StatusStatement.class);
    }

    @Override
    public StatusStatement findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStatusStatementUri()+"/"+id, StatusStatement.class);
    }

    @Override
    public List<StatusStatement> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStatusStatementUri()
                +"/find-all/?pageNo="+page+"&pageSize="+size, StatusStatement[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStatusStatementUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStatusStatementUri()+"/size", Integer.class);
    }
}
