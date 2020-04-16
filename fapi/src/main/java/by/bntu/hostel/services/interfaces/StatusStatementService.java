package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.StatusStatement;

import java.util.List;

public interface StatusStatementService {

    StatusStatement create(StatusStatement statusStatement);
    StatusStatement findById(int id);
    List<StatusStatement> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
