package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StudentPayment;
import by.bntu.hostel.repository.StudentPaymentRepo;
import by.bntu.hostel.services.interfaces.StudentPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentPaymentServiceImpl implements StudentPaymentService {

    @Autowired
    private StudentPaymentRepo studentPaymentRepo;

    @Override
    public StudentPayment create(StudentPayment studentPayment) {
        return studentPaymentRepo.save(studentPayment);
    }

    @Override
    public StudentPayment findById(int id) {
        return studentPaymentRepo.findById(id).get();
    }

    @Override
    public List<StudentPayment> findAll(int page, int size) {
        return studentPaymentRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        studentPaymentRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) studentPaymentRepo.count();
    }
}
