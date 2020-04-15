package by.bntu.hostel.repository;

import by.bntu.hostel.entity.DutyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyTypeRepo extends JpaRepository<DutyType,Integer> {
}
