package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Statement {

  private Integer id;
  private String description;
  private Integer statusStatementId;
  private Date date;
  private Integer staffId;
  private Integer studentId;

}
