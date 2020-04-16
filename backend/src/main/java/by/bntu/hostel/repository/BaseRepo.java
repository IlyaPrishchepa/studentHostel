package by.bntu.hostel.repository;

import by.bntu.hostel.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepo extends JpaRepository<Base,Integer> {
    Base findBaseByLogin(String login);
    Base findBaseByLoginAndPassword(String login, String password);

}
