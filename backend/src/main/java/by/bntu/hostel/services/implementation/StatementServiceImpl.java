package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Statement;
import by.bntu.hostel.entity.StatusStatement;
import by.bntu.hostel.repository.StatementRepo;
import by.bntu.hostel.services.interfaces.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementServiceImpl implements StatementService {

    @Autowired
    private StatementRepo statementRepo;

    @Override
    public Statement create(Statement statement) {
        return statementRepo.save(statement);
    }

    @Override
    public Statement findById(int id) {
        return statementRepo.findById(id).get();
    }

    @Override
    public List<Statement> findAll(int page, int size) {
        return statementRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        statementRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) statementRepo.count();
    }
}
