package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Statement {

  private int id;
  private String description;
  private int statusStatementId;
  private Date date;
  private int staffId;
  private int studentId;

}
