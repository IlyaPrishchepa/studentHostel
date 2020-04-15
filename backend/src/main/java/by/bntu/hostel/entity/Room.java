package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "room" )
public class Room {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Basic
  @Column(name = "number_place")
  private int numberPlace;

  @Basic
  @Column(name = "number_room")
  private String numberRoom;

}
