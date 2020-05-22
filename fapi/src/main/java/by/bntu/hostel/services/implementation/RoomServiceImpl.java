package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Room;
import by.bntu.hostel.property.BackendApiProperties;
import by.bntu.hostel.services.interfaces.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private BackendApiProperties backendApiProperties;

    private final RestTemplate restTemplate;

    public RoomServiceImpl(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Room create(Room room) {
        return restTemplate.postForObject(backendApiProperties.getRoomUri(),room,Room.class);
    }

    @Override
    public Room findById(int id) {
        return restTemplate.getForObject(backendApiProperties.getRoomUri()+"/"+id, Room.class);
    }

    @Override
    public List<Room> findAll(int page, int size) {
        return Arrays.asList(restTemplate.getForObject(backendApiProperties.getRoomUri()
                +"/find-all/?pageNo="+page+"&pageSize="+size, Room[].class));
    }

    @Override
    public void deleteByID(int id) {
        restTemplate.delete(backendApiProperties.getRoomUri() + "/" + id);
    }

    @Override
    public int getSize() {
        return restTemplate.getForObject(backendApiProperties.getRoomUri()+"/size", Integer.class);
    }
}
