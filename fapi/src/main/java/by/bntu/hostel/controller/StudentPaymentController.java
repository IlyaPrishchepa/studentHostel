package by.bntu.hostel.controller;

import by.bntu.hostel.entity.StudentPayment;
import by.bntu.hostel.services.implementation.StudentPaymentServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/student-payment")
public class StudentPaymentController {

    @Autowired
    private StudentPaymentServiceImpl studentPaymentService;

    @PostMapping
    public StudentPayment create(@RequestBody StudentPayment studentPayment){
        return studentPaymentService.create(studentPayment);

    }

    @GetMapping("/{id}")
    public StudentPayment findById(@PathVariable int id) {
        return studentPaymentService.findById(id);
    }

    @GetMapping("/find-all")
    public List<StudentPayment> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return studentPaymentService.findAll(pageNo-1,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        studentPaymentService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return studentPaymentService.getSize();
    }

}
