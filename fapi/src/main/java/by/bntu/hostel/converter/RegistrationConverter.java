package by.bntu.hostel.converter;

import by.bntu.hostel.entity.Base;
import by.bntu.hostel.entity.RegStudent;
import by.bntu.hostel.entity.Student;
import by.bntu.hostel.services.implementation.RoleServiceImpl;
import by.bntu.hostel.services.implementation.StatusPassportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class RegistrationConverter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleServiceImpl roleService;

    @Autowired
    private StatusPassportServiceImpl statusPassportService;


    public Student splitRegStudentIntoStudent (RegStudent regStudent){
        Base base = new Base();
        base.setFirstName(regStudent.getFirstName());
        base.setLogin(regStudent.getLogin());
        base.setPassword(passwordEncoder.encode(regStudent.getPassword()));
        base.setMiddleName(regStudent.getMiddleName());
        base.setPhone(regStudent.getPhone());
        base.setPhoto(regStudent.getPhoto());
        base.setSecondName(regStudent.getSecondName());
        base.setRoleId(roleService.findByName("STUDENT").getId());




        Student student = new Student();
        student.setGroup(regStudent.getGroup());
        student.setStatusPassportId(regStudent.getStatusPassportId());
        student.setStatusPassportId(1); // костыль
        student.setBaseId(base);

        return student;
    }


}
