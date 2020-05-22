package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Role;
import by.bntu.hostel.services.implementation.RoleServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    @PostMapping
    public Role create(@RequestBody Role role){
        return roleService.create(role);

    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable int id) {
        return roleService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Role> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return roleService.findAll(pageNo-1,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        roleService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return roleService.getSize();
    }

    @GetMapping("/find-by-name/{name}")
    public Role findByName(@PathVariable String name) {
        return roleService.findByName(name);
    }

}
