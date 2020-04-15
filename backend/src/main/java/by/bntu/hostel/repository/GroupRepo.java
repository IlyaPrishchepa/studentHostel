package by.bntu.hostel.repository;

import by.bntu.hostel.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepo extends JpaRepository<Group,Integer> {
}
