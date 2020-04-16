package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.DutyType;

import java.util.List;

public interface DutyTypeService {

  DutyType create(DutyType dutyType);
  DutyType findById(int id);
  List<DutyType> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
