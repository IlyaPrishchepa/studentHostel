package by.bntu.hostel.services.implementation;

import by.bntu.hostel.entity.Group;
import by.bntu.hostel.repository.GroupRepo;
import by.bntu.hostel.services.interfaces.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepo groupRepo;

    @Override
    public Group create(Group group) {
        return groupRepo.save(group);
    }

    @Override
    public Group findById(int id) {
        return groupRepo.findById(id).get();
    }

    @Override
    public List<Group> findAll(int page, int size) {
        return groupRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        groupRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) groupRepo.count();
    }
}
