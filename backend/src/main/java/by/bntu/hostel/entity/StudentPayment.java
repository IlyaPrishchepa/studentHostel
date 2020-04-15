package by.bntu.hostel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "student_payment" )
public class StudentPayment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Basic
  @Column(name = "date",nullable = false)
  private Date date;

  @Basic
  @Column(name = "amount")
  private double amount;

  @Basic
  @Column(name = "student_id",nullable = false)
  private int studentId;

  @Basic
  @Column(name = "payment_id",nullable = false)
  private int paymentId;

}
