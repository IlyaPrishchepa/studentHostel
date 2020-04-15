package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.StudentPayment;

import java.util.List;

public interface StudentPaymentService {

  StudentPayment create (StudentPayment studentPayment);
  StudentPayment findById(int id);
  List<StudentPayment> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
