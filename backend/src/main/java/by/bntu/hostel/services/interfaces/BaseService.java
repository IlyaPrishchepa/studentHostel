package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Base;

import java.util.List;

public interface BaseService {

  Base create (Base base);
  Base findById(int id);
  List<Base> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();
  Base findByLoginAndEmail(String login, String password);
  Base findByLogin(String login);

}
