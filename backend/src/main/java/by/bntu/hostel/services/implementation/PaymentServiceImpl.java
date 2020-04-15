package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Payment;
import by.bntu.hostel.repository.PaymentRepo;
import by.bntu.hostel.services.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public Payment create(Payment payment) {
        return paymentRepo.save(payment);
    }

    @Override
    public Payment findById(int id) {
        return paymentRepo.findById(id).get();
    }

    @Override
    public List<Payment> findAll(int page, int size) {
        return paymentRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        paymentRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) paymentRepo.count();
    }
}
