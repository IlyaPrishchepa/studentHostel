package by.bntu.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentPayment {

  private int id;
  private Date date;
  private double amount;
  private int studentId;
  private Payment paymentId;

}
