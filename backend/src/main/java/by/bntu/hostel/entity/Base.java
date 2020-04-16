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
  private int id;

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

  @Lob
  @Column(name = "photo")
  private Blob photo;

  @OneToOne(mappedBy = "baseId", cascade = CascadeType.ALL)
  @JsonIgnore
  private Staff staff;

  @OneToOne(mappedBy = "baseId", cascade = CascadeType.ALL)
  @JsonIgnore
  private Student student;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "role_id", referencedColumnName = "id")
  private Role roleId;

}
