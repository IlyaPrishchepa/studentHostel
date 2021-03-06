package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;

@Getter
@Setter
@Entity
@Table(name = "base" )
public class Base {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Basic
  @Column(name = "login",nullable = false)
  private String login;

  @Basic
  @Column(name = "password",nullable = false)
  private String password;

  @Basic
  @Column(name = "first_name",nullable = false)
  private String firstName;

  @Basic
  @Column(name = "second_name",nullable = false)
  private String secondName;

  @Basic
  @Column(name = "middle_name")
  private String middleName;

  @Basic
  @Column(name = "phone",nullable = false)
  private String phone;

  @Basic
  @Column(name = "photo")
  private Blob photo;

  @OneToOne(mappedBy = "baseId", cascade = CascadeType.ALL)
  @JsonIgnore
  private Staff staff;

  @OneToOne(mappedBy = "baseId", cascade = CascadeType.ALL)
  @JsonIgnore
  private Student student;

  @Basic
  @Column(name = "role_id",nullable = false)
  private Integer roleId;

}
