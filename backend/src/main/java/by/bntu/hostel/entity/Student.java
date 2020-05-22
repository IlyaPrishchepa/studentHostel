package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "student" )
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "base_id", referencedColumnName = "id")
  private Base baseId;

  @Basic
  @Column(name = "group_id",nullable = false)
  private Integer group;

  @Basic
  @Column(name = "status_passport_id")
  private Integer statusPassportId;

}
