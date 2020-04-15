package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.StatusStatement;
import by.bntu.hostel.repository.StatusStatementRepo;
import by.bntu.hostel.services.interfaces.StatusStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusStatementServiceImpl implements StatusStatementService {

    @Autowired
    private StatusStatementRepo statusStatementRepo;

    @Override
    public StatusStatement create(StatusStatement statusStatement) {
        return statusStatementRepo.save(statusStatement);
    }

    @Override
    public StatusStatement findById(int id) {
        return statusStatementRepo.findById(id).get();
    }

    @Override
    public List<StatusStatement> findAll(int page, int size) {
        return statusStatementRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        statusStatementRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) statusStatementRepo.count();
    }
}
