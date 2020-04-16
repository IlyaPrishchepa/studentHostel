package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Duty {

  private int id;
  private int studentId;
  private Date date;
  private int dutyTypeId;
  private String description;
  private int points;

}
