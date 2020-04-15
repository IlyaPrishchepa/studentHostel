package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "statement" )
public class Statement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Basic
  @Column(name = "description")
  private String description;

  @Basic
  @Column(name = "status_statement_id",nullable = false)
  private int statusStatementId;

  @Basic
  @Column(name = "date",nullable = false)
  private Date date;

  @Basic
  @Column(name = "staff_id",nullable = false)
  private int staffId;

  @Basic
  @Column(name = "student_id",nullable = false)
  private int studentId;

}
