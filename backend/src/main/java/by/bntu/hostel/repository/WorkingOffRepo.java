package by.bntu.hostel.repository;

import by.bntu.hostel.entity.WorkingOff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingOffRepo extends JpaRepository<WorkingOff,Integer> {
}
