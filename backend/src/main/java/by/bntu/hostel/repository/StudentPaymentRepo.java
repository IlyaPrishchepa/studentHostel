package by.bntu.hostel.repository;

import by.bntu.hostel.entity.StudentPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPaymentRepo extends JpaRepository<StudentPayment,Integer> {
}
