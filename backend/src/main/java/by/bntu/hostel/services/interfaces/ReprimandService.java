package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Reprimand;

import java.util.List;

public interface ReprimandService {

  Reprimand create (Reprimand reprimand);
  Reprimand findById(int id);
  List<Reprimand> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
