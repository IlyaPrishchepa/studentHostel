package by.bntu.hostel.controller;

import by.bntu.hostel.entity.StatusPassport;
import by.bntu.hostel.services.implementation.StatusPassportServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/status-passport")
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

    @GetMapping
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
