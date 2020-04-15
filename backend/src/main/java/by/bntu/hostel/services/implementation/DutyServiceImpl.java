package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Duty;
import by.bntu.hostel.repository.DutyRepo;
import by.bntu.hostel.services.interfaces.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    private DutyRepo dutyRepo;

    @Override
    public Duty create(Duty duty) {
        return dutyRepo.save(duty);
    }

    @Override
    public Duty findById(int id) {
        return dutyRepo.findById(id).get();
    }

    @Override
    public List<Duty> findAll(int page, int size) {
        return dutyRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        dutyRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) dutyRepo.count();
    }
}
