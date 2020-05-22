package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Statement;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StatementServiceImpl implements StatementService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StatementServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Statement create(Statement statement) {
        return restTemplate.postForObject(backendApiProperties.getStatementUri(),statement,Statement.class);
    }

    @Override
    public Statement findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStatementUri()+"/"+id, Statement.class);
    }

    @Override
    public List<Statement> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStatementUri()
                +"/find-all/?pageNo="+page+"&pageSize="+size, Statement[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStatementUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStatementUri()+"/size", Integer.class);
    }
}
