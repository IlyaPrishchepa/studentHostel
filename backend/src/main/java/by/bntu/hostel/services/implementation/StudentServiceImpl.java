package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Student;
import by.bntu.hostel.repository.StudentRepo;
import by.bntu.hostel.services.interfaces.StudentReprimandService;
import by.bntu.hostel.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student create(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student findById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public List<Student> findAll(int page, int size) {
        return studentRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) studentRepo.count();
    }
}
