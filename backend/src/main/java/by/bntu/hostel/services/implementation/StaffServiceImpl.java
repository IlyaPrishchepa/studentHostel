package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Staff;
import by.bntu.hostel.repository.StaffRepo;
import by.bntu.hostel.services.interfaces.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepo staffRepo;

    @Override
    public Staff create(Staff staff) {
        return staffRepo.save(staff);
    }

    @Override
    public Staff findById(int id) {
        return staffRepo.findById(id).get();
    }

    @Override
    public List<Staff> findAll(int page, int size) {
        return staffRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        staffRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) staffRepo.count();
    }
}
