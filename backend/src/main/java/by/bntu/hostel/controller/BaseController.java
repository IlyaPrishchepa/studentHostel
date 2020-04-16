package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Base;
import by.bntu.hostel.services.implementation.BaseServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private BaseServiceImpl baseService;

    @PostMapping
    public Base create(@RequestBody Base base){
        return baseService.create(base);

    }

    @GetMapping("/{id}")
    public Base findById(@PathVariable int id) {
        return baseService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Base> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return baseService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        baseService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return baseService.getSize();
    }

    @GetMapping
    public Base findByLoginAndPassword(@RequestParam String login,@RequestParam String password) {
        return baseService.findByLoginAndEmail(login,password);
    }

    @GetMapping("/find-by-login/{login}")
    public Base findByLoginl(@PathVariable String login) {
        return baseService.findByLogin(login);
    }

}
