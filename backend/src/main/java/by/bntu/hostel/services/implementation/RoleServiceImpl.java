package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Role;
import by.bntu.hostel.repository.RoleRepo;
import by.bntu.hostel.services.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Role create(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public Role findById(int id) {
        return roleRepo.findById(id).get();
    }

    @Override
    public List<Role> findAll(int page, int size) {
        return roleRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        roleRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) roleRepo.count();
    }
}
