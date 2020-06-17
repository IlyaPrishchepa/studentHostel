package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

  private Integer id;
  private Base baseId;
  private int group;
  private int statusPassportId;

}
