package by.bntu.hostel.repository;

import by.bntu.hostel.entity.StatusPassport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusPassportRepo extends JpaRepository<StatusPassport,Integer> {
}
