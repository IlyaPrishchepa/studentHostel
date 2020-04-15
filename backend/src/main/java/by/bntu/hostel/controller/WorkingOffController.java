package by.bntu.hostel.controller;

import by.bntu.hostel.entity.WorkingOff;
import by.bntu.hostel.services.implementation.WorkingOffServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/working-off")
public class WorkingOffController  {

    @Autowired
    private WorkingOffServiceImpl workingOffService;

    @PostMapping
    public WorkingOff create(@RequestBody WorkingOff workingOff){
        return workingOffService.create(workingOff);

    }

    @GetMapping("/{id}")
    public WorkingOff findById(@PathVariable int id) {
        return workingOffService.findById(id);
    }

    @GetMapping
    public List<WorkingOff> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return workingOffService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        workingOffService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return workingOffService.getSize();
    }

}
