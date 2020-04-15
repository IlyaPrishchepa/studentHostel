package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Room;
import by.bntu.hostel.repository.RoomRepo;
import by.bntu.hostel.services.interfaces.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepo roomRepo;

    @Override
    public Room create(Room room) {
        return roomRepo.save(room);
    }

    @Override
    public Room findById(int id) {
        return roomRepo.findById(id).get();
    }

    @Override
    public List<Room> findAll(int page, int size) {
        return roomRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        roomRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) roomRepo.count();
    }
}
