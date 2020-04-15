package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Student;

import java.util.List;

public interface StudentService {

    Student create (Student student);
    Student findById(int id);
    List<Student> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();

}
