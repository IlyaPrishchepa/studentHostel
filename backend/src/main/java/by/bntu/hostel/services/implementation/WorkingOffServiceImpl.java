package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.WorkingOff;
import by.bntu.hostel.repository.WorkingOffRepo;
import by.bntu.hostel.services.interfaces.WorkingOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingOffServiceImpl implements WorkingOffService {

    @Autowired
    private WorkingOffRepo workingOffRepo;

    @Override
    public WorkingOff create(WorkingOff workingOff) {
        return workingOffRepo.save(workingOff);
    }

    @Override
    public WorkingOff findById(int id) {
        return workingOffRepo.findById(id).get();
    }

    @Override
    public List<WorkingOff> findAll(int page, int size) {
        return workingOffRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        workingOffRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) workingOffRepo.count();
    }
}
