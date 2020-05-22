package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Base;
import by.bntu.hostel.services.implementation.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/base")
public class BaseController {

    @Autowired
    private BaseServiceImpl baseService;

    @PostMapping
    public ResponseEntity<Base> create(@RequestBody Base base){
        if (base != null) {
            return ResponseEntity.ok(baseService.create(base));
        }
        return null;
    }

    @GetMapping("/{id}")
    public Base findById(@PathVariable int id) {
        return baseService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Base> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return baseService.findAll(pageNo-1,pageSize);
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
    public ResponseEntity<Base> findByLoginAndPassword(@RequestParam String login,@RequestParam String password) {
        return ResponseEntity.ok(baseService.findByLoginAndEmail(login,password));
    }

    @GetMapping("/find-by-login/{login}")
    public Base findByLogin(@PathVariable String login) {
        return baseService.findByLogin(login);
    }

    @GetMapping("/get-current-base")
    public ResponseEntity<Base> getCurrentBase(@RequestHeader(value = "Authorization", required = false) String bearerToken) {
        String login = baseService.getLogin(bearerToken);
        return ResponseEntity.ok(baseService.findByLogin(login));
    }

}
