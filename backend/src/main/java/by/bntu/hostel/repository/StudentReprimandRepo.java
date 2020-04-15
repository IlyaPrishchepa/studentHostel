package by.bntu.hostel.repository;

import by.bntu.hostel.entity.StudentReprimand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReprimandRepo extends JpaRepository<StudentReprimand,Integer> {
}
