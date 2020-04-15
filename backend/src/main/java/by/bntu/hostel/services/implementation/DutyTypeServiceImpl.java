package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.DutyType;
import by.bntu.hostel.repository.DutyTypeRepo;
import by.bntu.hostel.services.interfaces.DutyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyTypeServiceImpl implements DutyTypeService {

    @Autowired
    private DutyTypeRepo dutyTypeRepo;

    @Override
    public DutyType create(DutyType dutyType) {
        return dutyTypeRepo.save(dutyType);
    }

    @Override
    public DutyType findById(int id) {
        return dutyTypeRepo.findById(id).get();
    }

    @Override
    public List<DutyType> findAll(int page, int size) {
        return dutyTypeRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        dutyTypeRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) dutyTypeRepo.count();
    }
}
