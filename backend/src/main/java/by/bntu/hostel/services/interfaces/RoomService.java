package by.bntu.hostel.services.interfaces;

import by.bntu.hostel.entity.Room;

import java.util.List;

public interface RoomService {

  Room create (Room room);
  Room findById(int id);
  List<Room> findAll(int page, int size);
  void deleteByID(int id);
  int getSize();

}
