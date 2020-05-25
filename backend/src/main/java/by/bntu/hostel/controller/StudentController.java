package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Student;
import by.bntu.hostel.services.implementation.StudentServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.create(student);

    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Student> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return studentService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        studentService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return studentService.getSize();
    }

    @GetMapping("/find-byBaseId/{baseId}")
    public Student findByBaseId(@PathVariable int baseId) {
        return studentService.findByBaseId(baseId);
    }

}
