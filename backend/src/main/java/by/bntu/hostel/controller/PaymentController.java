package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Payment;
import by.bntu.hostel.services.implementation.PaymentServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping
    public Payment create(@RequestBody Payment payment){
        return paymentService.create(payment);

    }

    @GetMapping("/{id}")
    public Payment findById(@PathVariable int id) {
        return paymentService.findById(id);
    }

    @GetMapping
    public List<Payment> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return paymentService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        paymentService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return paymentService.getSize();
    }

}
