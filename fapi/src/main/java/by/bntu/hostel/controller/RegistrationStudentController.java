package by.bntu.hostel.controller;

import by.bntu.hostel.converter.RegistrationConverter;
import by.bntu.hostel.entity.RegStudent;
import by.bntu.hostel.entity.StatusPassport;
import by.bntu.hostel.entity.Student;
import by.bntu.hostel.entity.StudentRoom;
import by.bntu.hostel.services.implementation.RoomServiceImpl;
import by.bntu.hostel.services.implementation.StatusPassportServiceImpl;
import by.bntu.hostel.services.implementation.StudentRoomServiceImpl;
import by.bntu.hostel.services.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration-student")
public class RegistrationStudentController {


    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private StudentRoomServiceImpl studentRoomService;

    @Autowired
    private RegistrationConverter converter;

    @PostMapping
    public ResponseEntity<Student> add(@RequestBody RegStudent regStudent){

        String key = regStudent.getKey();
        Student newStudent=null;
        StudentRoom studentRoom = studentRoomService.findStudentRoomByKey(key);
        if (studentRoom != null){
            newStudent = studentService.create(converter.splitRegStudentIntoStudent(regStudent));
            studentRoom.setStudentId(newStudent);
            studentRoomService.create(studentRoom);
            return ResponseEntity.ok(newStudent);
        }
        else{
            return new ResponseEntity<>(newStudent, HttpStatus.BAD_REQUEST);
        }
    }

}
