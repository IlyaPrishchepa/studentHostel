package by.bntu.hostel.repository;

import by.bntu.hostel.entity.Statement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatementRepo extends JpaRepository<Statement,Integer> {
    List<Statement> findStatementByStudentId(int id);
    List<Statement> findStatementByStaffId(int id);
}
