package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.sql.Blob;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Base {

  private int id;
  private String login;
  private String password;
  private String firstName;
  private String secondName;
  private String middleName;
  private String phone;
  private Blob photo;
  private Staff staff;
  private Student student;
  private int roleId;

}
