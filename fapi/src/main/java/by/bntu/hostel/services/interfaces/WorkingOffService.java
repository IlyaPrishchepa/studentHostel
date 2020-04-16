package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.WorkingOff;

import java.util.List;

public interface WorkingOffService {

  WorkingOff create(WorkingOff workingOff);
  WorkingOff findById(int id);
  List<WorkingOff> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
