package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StatusPassport;
import by.bntu.hostel.repository.StatusPassportRepo;
import by.bntu.hostel.services.interfaces.StatusPassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusPassportServiceImpl implements StatusPassportService {

    @Autowired
    private StatusPassportRepo statusPassportRepo;

    @Override
    public StatusPassport create(StatusPassport statusPassport) {
        return statusPassportRepo.save(statusPassport);
    }

    @Override
    public StatusPassport findById(int id) {
        return statusPassportRepo.findById(id).get();
    }

    @Override
    public List<StatusPassport> findAll(int page, int size) {
        return statusPassportRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        statusPassportRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) statusPassportRepo.count();
    }
}
