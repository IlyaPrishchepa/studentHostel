package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StudentRoom;
import by.bntu.hostel.repository.StudentRoomRepo;
import by.bntu.hostel.services.interfaces.StudentRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentRoomServiceImpl implements StudentRoomService {

    @Autowired
    private StudentRoomRepo studentRoomRepo;

    @Override
    public StudentRoom create(StudentRoom studentRoom) {
        return studentRoomRepo.save(studentRoom);
    }

    @Override
    public StudentRoom findById(int id) {
        return studentRoomRepo.findById(id).get();
    }

    @Override
    public List<StudentRoom> findAll(int page, int size) {
        return studentRoomRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        studentRoomRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) studentRoomRepo.count();
    }
}
