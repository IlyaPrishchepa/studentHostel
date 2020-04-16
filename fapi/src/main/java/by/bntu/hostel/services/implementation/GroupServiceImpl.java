package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Group;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public GroupServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Group create(Group group) {
        return restTemplate.postForObject(backendApiProperties.getGroupUri(),group,Group.class);
    }

    @Override
    public Group findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getGroupUri()+"/"+id, Group.class);
    }

    @Override
    public List<Group> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getGroupUri()
                +"/find-all/?pageSize="+page+"&pageNo="+size, Group[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getGroupUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getGroupUri()+"/size", Integer.class);
    }
}
