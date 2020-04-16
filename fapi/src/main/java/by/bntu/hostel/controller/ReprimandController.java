package by.bntu.hostel.controller;


import by.bntu.hostel.entity.Reprimand;
import by.bntu.hostel.services.implementation.ReprimandServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/reprimand")
public class ReprimandController {

    @Autowired
    private ReprimandServiceImpl reprimandService;

    @PostMapping
    public Reprimand create(@RequestBody Reprimand reprimand){
        return reprimandService.create(reprimand);

    }

    @GetMapping("/{id}")
    public Reprimand findById(@PathVariable int id) {
        return reprimandService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Reprimand> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return reprimandService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        reprimandService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return reprimandService.getSize();
    }

}
