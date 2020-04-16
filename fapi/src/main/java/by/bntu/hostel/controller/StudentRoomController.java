package by.bntu.hostel.controller;

import by.bntu.hostel.entity.StudentRoom;
import by.bntu.hostel.services.implementation.StudentRoomServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/student-room")
public class StudentRoomController {

    @Autowired
    private StudentRoomServiceImpl studentRoomService;

    @PostMapping
    public StudentRoom create(@RequestBody StudentRoom studentRoom){
        return studentRoomService.create(studentRoom);

    }

    @GetMapping("/{id}")
    public StudentRoom findById(@PathVariable int id) {
        return studentRoomService.findById(id);
    }

    @GetMapping("/find-all")
    public List<StudentRoom> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return studentRoomService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        studentRoomService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return studentRoomService.getSize();
    }

}
