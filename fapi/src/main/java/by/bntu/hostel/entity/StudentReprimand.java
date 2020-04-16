package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentReprimand {

  private int id;
  private int studentId;
  private int reprimandId;
  private String description;

}
