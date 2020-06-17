package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "status_statement")
public class StatusStatement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Basic
  @Column(name = "name",nullable = false)
  private String name;

}
