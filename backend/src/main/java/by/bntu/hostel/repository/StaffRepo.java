package by.bntu.hostel.repository;

import by.bntu.hostel.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Integer> {
    List<Staff> findStaffByBaseId_RoleId(int id);
    Staff findStaffByBaseId_Id(int id);
}
