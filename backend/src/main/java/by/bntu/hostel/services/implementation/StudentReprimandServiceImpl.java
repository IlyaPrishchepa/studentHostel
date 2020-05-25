package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StudentReprimand;
import by.bntu.hostel.repository.StudentReprimandRepo;
import by.bntu.hostel.services.interfaces.StudentReprimandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentReprimandServiceImpl implements StudentReprimandService {

    @Autowired
    private StudentReprimandRepo studentReprimandRepo;

    @Override
    public StudentReprimand create(StudentReprimand studentReprimand) {
        return studentReprimandRepo.save(studentReprimand);
    }

    @Override
    public StudentReprimand findById(int id) {
        return studentReprimandRepo.findById(id).get();
    }

    @Override
    public List<StudentReprimand> findAll(int page, int size) {
        return studentReprimandRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        studentReprimandRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) studentReprimandRepo.count();
    }

    @Override
    public StudentReprimand findByStudentID(int id) {
        return studentReprimandRepo.findStudentReprimandByStudentId(id);
    }
}
