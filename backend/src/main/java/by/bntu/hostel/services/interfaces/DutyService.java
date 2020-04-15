package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Duty;

import java.util.List;

public interface DutyService {

  Duty create (Duty duty);
  Duty findById(int id);
  List<Duty> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
