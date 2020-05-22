package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Student;
import by.bntu.hostel.services.implementation.StudentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        return  ResponseEntity.ok(studentService.create(student));

    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Student> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return studentService.findAll(pageNo-1,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        studentService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return studentService.getSize();
    }

}
