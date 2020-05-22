package by.bntu.hostel.controller;

import by.bntu.hostel.entity.StatusStatement;
import by.bntu.hostel.services.implementation.StatusStatementServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/status-statement")
public class StatusStatementController {

    @Autowired
    private StatusStatementServiceImpl statusStatementService;

    @PostMapping
    public StatusStatement create(@RequestBody StatusStatement statusStatement){
        return statusStatementService.create(statusStatement);

    }

    @GetMapping("/{id}")
    public StatusStatement findById(@PathVariable int id) {
        return statusStatementService.findById(id);
    }

    @GetMapping("/find-all")
    public List<StatusStatement> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return statusStatementService.findAll(pageNo-1,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        statusStatementService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return statusStatementService.getSize();
    }

}
