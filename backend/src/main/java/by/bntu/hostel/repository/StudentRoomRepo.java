package by.bntu.hostel.repository;

import by.bntu.hostel.entity.StudentRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRoomRepo extends JpaRepository<StudentRoom,Integer> {
    StudentRoom findStudentRoomByKey(String key);

}
