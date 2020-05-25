package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Staff;
import by.bntu.hostel.services.implementation.StaffServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffServiceImpl staffService;

    @PostMapping
    public Staff create(@RequestBody Staff staff){
        return staffService.create(staff);

    }

    @GetMapping("/{id}")
    public Staff findById(@PathVariable int id) {
        return staffService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Staff> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return staffService.findAll(pageNo-1,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        staffService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return staffService.getSize();
    }

    @GetMapping("/find-by-baseId_RoleID/{id}")
    public List<Staff> findByBaseId_RoleId(@PathVariable int id) {
        return staffService.findByBaseId_RoleId(id);
    }

}
