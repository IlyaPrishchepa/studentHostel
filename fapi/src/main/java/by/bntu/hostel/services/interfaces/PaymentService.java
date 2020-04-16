package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Payment;

import java.util.List;

public interface PaymentService {

  Payment create(Payment payment);
  Payment findById(int id);
  List<Payment> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
