package by.bntu.hostel.repository;

import by.bntu.hostel.entity.StudentRoom;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRoomRepo extends JpaRepository<StudentRoom,Integer> {
    StudentRoom findStudentRoomByKey(String key);
    StudentRoom findStudentRoomByStudentId_Id(int id);
    List<StudentRoom> findStudentRoomByRoomId(int id);


}
