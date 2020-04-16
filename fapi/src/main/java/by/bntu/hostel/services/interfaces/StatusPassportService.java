package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.StatusPassport;

import java.util.List;

public interface StatusPassportService {

  StatusPassport create(StatusPassport statusPassport);
  StatusPassport findById(int id);
  List<StatusPassport> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
