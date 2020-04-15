package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "student_reprimand" )
public class StudentReprimand {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Basic
  @Column(name = "student_id",nullable = false)
  private int studentId;

  @Basic
  @Column(name = "reprimand_id",nullable = false)
  private int reprimandId;

  @Basic
  @Column(name = "description")
  private String description;

}
