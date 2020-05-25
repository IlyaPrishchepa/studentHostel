package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "duty" )
public class Duty {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @ManyToOne
  @JoinColumn(name = "room_id", referencedColumnName = "id")
  private Room roomId;

  @Basic
  @Column(name = "date",nullable = false)
  private Date date;

  @Basic
  @Column(name = "duty_type_id",nullable = false)
  private int dutyTypeId;

  @Basic
  @Column(name = "description")
  private String description;

  @Basic
  @Column(name = "points",nullable = false)
  private int points;

}
