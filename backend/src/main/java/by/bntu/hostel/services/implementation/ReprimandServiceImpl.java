package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Reprimand;
import by.bntu.hostel.repository.ReprimandRepo;
import by.bntu.hostel.services.interfaces.ReprimandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReprimandServiceImpl implements ReprimandService {

    @Autowired
    private ReprimandRepo reprimandRepo;

    @Override
    public Reprimand create(Reprimand reprimand) {
        return reprimandRepo.save(reprimand);
    }

    @Override
    public Reprimand findById(int id) {
        return reprimandRepo.findById(id).get();
    }

    @Override
    public List<Reprimand> findAll(int page, int size) {
        return reprimandRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        reprimandRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) reprimandRepo.count();
    }
}
