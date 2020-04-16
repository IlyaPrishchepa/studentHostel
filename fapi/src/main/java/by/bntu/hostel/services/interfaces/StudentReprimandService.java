package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.StudentReprimand;

import java.util.List;

public interface StudentReprimandService {

    StudentReprimand create(StudentReprimand studentReprimand);
    StudentReprimand findById(int id);
    List<StudentReprimand> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();

}
