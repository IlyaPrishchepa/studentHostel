package by.bntu.hostel.controller;


import by.bntu.hostel.entity.Group;
import by.bntu.hostel.services.implementation.GroupServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupServiceImpl groupService;

    @PostMapping
    public Group create(@RequestBody Group group){
        return groupService.create(group);

    }

    @GetMapping("/{id}")
    public Group findById(@PathVariable int id) {
        return groupService.findById(id);
    }

    @GetMapping
    public List<Group> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return groupService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        groupService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return groupService.getSize();
    }

}
