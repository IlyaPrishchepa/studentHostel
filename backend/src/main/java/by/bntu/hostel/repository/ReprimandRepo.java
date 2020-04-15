package by.bntu.hostel.repository;

import by.bntu.hostel.entity.Reprimand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReprimandRepo extends JpaRepository<Reprimand,Integer> {
}
