package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Statement;
import by.bntu.hostel.services.implementation.StatementServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/statement")
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

}
