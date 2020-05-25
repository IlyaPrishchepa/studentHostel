package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Staff;

import java.util.List;

public interface StaffService {

  Staff create(Staff staff);
  Staff findById(int id);
  List<Staff> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();
  List<Staff> findByBaseId_RoleId(int id);

}
