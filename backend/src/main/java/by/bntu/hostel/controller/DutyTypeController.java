package by.bntu.hostel.controller;

import by.bntu.hostel.entity.DutyType;
import by.bntu.hostel.services.implementation.DutyTypeServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/duty-type")
public class DutyTypeController {

    @Autowired
    private DutyTypeServiceImpl dutyTypeService;

    @PostMapping
    public DutyType create(@RequestBody DutyType dutyType){
        return dutyTypeService.create(dutyType);

    }

    @GetMapping("/{id}")
    public DutyType findById(@PathVariable int id) {
        return dutyTypeService.findById(id);
    }

    @GetMapping("/find-all")
    public List<DutyType> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return dutyTypeService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        dutyTypeService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return dutyTypeService.getSize();
    }

}
