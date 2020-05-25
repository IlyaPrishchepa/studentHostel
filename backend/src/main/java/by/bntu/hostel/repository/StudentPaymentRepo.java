package by.bntu.hostel.repository;

import by.bntu.hostel.entity.StudentPayment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentPaymentRepo extends JpaRepository<StudentPayment,Integer> {
    StudentPayment findStudentPaymentByStudentId(int id);
    List<StudentPayment> findStudentPaymentByStudentId(int id, Pageable pageable);
    int countByStudentId(int id);
}
