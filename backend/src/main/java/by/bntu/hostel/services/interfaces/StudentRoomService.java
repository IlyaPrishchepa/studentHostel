package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.StudentRoom;

import java.util.List;

public interface StudentRoomService {

    StudentRoom create (StudentRoom studentRoom);
    StudentRoom findById(int id);
    List<StudentRoom> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
    StudentRoom findStudentRoomByKey(String key);

}
