package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Statement;
import by.bntu.hostel.services.implementation.StatementServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/statement")
public class StatementController {

    @Autowired
    private StatementServiceImpl statementService;

    @PostMapping
    public Statement create(@RequestBody Statement statement){
        return statementService.create(statement);

    }

    @GetMapping("/{id}")
    public Statement findById(@PathVariable int id) {
        return statementService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Statement> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return statementService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        statementService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return statementService.getSize();
    }

    @GetMapping("/find-by-StudentId/{id}")
    public List<Statement> findByStudentId(@PathVariable int id) {
        return statementService.findByStudentId(id);
    }

    @GetMapping("/find-by-StaffId/{id}")
    public List<Statement> findByStaffId(@PathVariable int id) {
        return statementService.findByStaffId(id);
    }


}
