package by.bntu.hostel.repository;

import by.bntu.hostel.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findStudentByBaseId_Id(int baseId);
}
