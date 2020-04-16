package by.bntu.hostel.controller;

import by.bntu.hostel.entity.StatusPassport;
import by.bntu.hostel.services.implementation.StatusPassportServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/status-passport")
public class StatusPassportController {

    @Autowired
    private StatusPassportServiceImpl statusPassportService;

    @PostMapping
    public StatusPassport create(@RequestBody StatusPassport statusPassport){
        return statusPassportService.create(statusPassport);

    }

    @GetMapping("/{id}")
    public StatusPassport findById(@PathVariable int id) {
        return statusPassportService.findById(id);
    }

    @GetMapping("/find-all")
    public List<StatusPassport> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return statusPassportService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        statusPassportService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return statusPassportService.getSize();
    }

}
