package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Staff;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StaffServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Staff create(Staff staff) {
        return restTemplate.postForObject(backendApiProperties.getStaffUri(),staff,Staff.class);
    }

    @Override
    public Staff findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStaffUri()+"/"+id, Staff.class);
    }

    @Override
    public List<Staff> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStaffUri()
                +"/find-all/?pageNo="+page+"&pageSize="+size, Staff[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStaffUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStaffUri()+"/size", Integer.class);
    }

    @Override
    public List<Staff> findByBaseId_RoleId(int id) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStaffUri()
                +"/find-by-baseId_RoleID/"+id, Staff[].class));
    }

    @Override
    public Staff findByBaseId(int baseId) {
        return restTemplate.getForObject(backendApiProperties.getStaffUri()
                +"/find-byBaseId/" + baseId, Staff.class);
    }
}
