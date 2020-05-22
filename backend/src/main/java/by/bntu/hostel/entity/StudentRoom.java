package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "student_room" )
public class StudentRoom {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Basic
  @Column(name = "student_id")
  private Integer studentId;

  @Basic
  @Column(name = "room_id",nullable = false)
  private Integer roomId;

  @Basic
  @Column(name = "personal_key",nullable = false)
  private String key;

}
