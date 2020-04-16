package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Duty;
import by.bntu.hostel.services.implementation.DutyServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/duty")
public class DutyController  {

    @Autowired
    private DutyServiceImpl dutyService;

    @PostMapping
    public Duty create(@RequestBody Duty duty){
        return dutyService.create(duty);

    }

    @GetMapping("/{id}")
    public Duty findById(@PathVariable int id) {
        return dutyService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Duty> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return dutyService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        dutyService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return dutyService.getSize();
    }

}
