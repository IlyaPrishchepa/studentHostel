package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Base;
import by.bntu.hostel.repository.BaseRepo;
import by.bntu.hostel.services.interfaces.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseServiceImpl implements BaseService{

    @Autowired
    private BaseRepo baseRepo;

    @Override
    public Base create(Base base) {
        return baseRepo.save(base);
    }

    @Override
    public Base findById(int id) {
        return baseRepo.findById(id).get();
    }

    @Override
    public List<Base> findAll(int page, int size) {
        return baseRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        baseRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) baseRepo.count();
    }

    @Override
    public Base findByLoginAndEmail(String login, String password) {
        return findByLoginAndEmail(login,password);
    }

    @Override
    public Base findByLogin(String login) {
        return findByLogin(login);
    }
}
