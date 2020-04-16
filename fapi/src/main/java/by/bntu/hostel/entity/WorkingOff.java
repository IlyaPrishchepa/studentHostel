package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkingOff {

  private int id;
  private int studentId;
  private Date date;
  private int points;
  private String description;

}
