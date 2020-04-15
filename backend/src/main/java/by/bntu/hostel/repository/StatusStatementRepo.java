package by.bntu.hostel.repository;

import by.bntu.hostel.entity.StatusStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusStatementRepo extends JpaRepository<StatusStatement,Integer> {
}
