package by.bntu.hostel.repository;

import by.bntu.hostel.entity.Duty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyRepo extends JpaRepository<Duty,Integer> {
}
