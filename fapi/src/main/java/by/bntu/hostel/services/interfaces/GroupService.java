package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Group;

import java.util.List;

public interface GroupService {

  Group create(Group group);
  Group findById(int id);
  List<Group> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
