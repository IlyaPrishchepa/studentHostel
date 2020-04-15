package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Statement;

import java.util.List;

public interface StatementService {

  Statement create (Statement statement);
  Statement findById(int id);
  List<Statement> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
