package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StudentRoom;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.StudentRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentRoomServiceImpl implements StudentRoomService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public StudentRoomServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public StudentRoom create(StudentRoom studentRoom) {
        return restTemplate.postForObject(backendApiProperties.getStudentRoomUri(),studentRoom,StudentRoom.class);
    }

    @Override
    public StudentRoom findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getStudentRoomUri()+"/"+id, StudentRoom.class);
    }

    @Override
    public List<StudentRoom> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getStudentRoomUri()
                +"/find-all/?pageNo="+page+"&pageSize="+size, StudentRoom[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getStudentRoomUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getStudentRoomUri()+"/size", Integer.class);
    }

    @Override
    public StudentRoom findStudentRoomByKey(String key) {
        return restTemplate.getForObject(backendApiProperties.getStudentRoomUri()+"/find-by-key/"+key, StudentRoom.class);
    }

}
