package by.bntu.hostel.controller;

import by.bntu.hostel.entity.StudentReprimand;
import by.bntu.hostel.services.implementation.StudentReprimandServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/student-reprimand")
public class StudentReprimandController {

    @Autowired
    private StudentReprimandServiceImpl studentReprimandService;

    @PostMapping
    public StudentReprimand create(@RequestBody StudentReprimand studentReprimand){
        return studentReprimandService.create(studentReprimand);

    }

    @GetMapping("/{id}")
    public StudentReprimand findById(@PathVariable int id) {
        return studentReprimandService.findById(id);
    }

    @GetMapping("/find-all")
    public List<StudentReprimand> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return studentReprimandService.findAll(pageNo-1,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        studentReprimandService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return studentReprimandService.getSize();
    }

}
