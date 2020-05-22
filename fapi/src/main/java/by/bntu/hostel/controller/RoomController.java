package by.bntu.hostel.controller;

import by.bntu.hostel.entity.Room;
import by.bntu.hostel.services.implementation.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController {

    @Autowired
    private RoomServiceImpl roomService;

    @PostMapping
    public Room create(@RequestBody Room room){
        return roomService.create(room);

    }

    @GetMapping("/{id}")
    public Room findById(@PathVariable int id) {
        return roomService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Room> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return roomService.findAll(pageNo-1,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        roomService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return roomService.getSize();
    }

}
