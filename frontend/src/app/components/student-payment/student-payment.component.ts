import { Component, OnInit } from '@angular/core';
import {StudentPayment} from '../../model/student-peyment/student-payment';
import {StudentPaymentService} from '../../services/studen-payment/student-payment.service';
import {TokenStorage} from '../../token.storage';

@Component({
  selector: 'app-student-payment',
  templateUrl: './student-payment.component.html',
  styleUrls: ['./student-payment.component.css']
})
export class StudentPaymentComponent implements OnInit {

  public page:number = 1;
  public pageSize: number = 12

  public studentPayments: StudentPayment[] = [];

  constructor(public tokenStorage: TokenStorage,
    private studentPaymentService:StudentPaymentService) { }

  ngOnInit(): void {
    this.getStudentPayment();
  }

  getStudentPayment() {
    this.studentPaymentService.getAllByStudentId(this.page,this.pageSize,this.tokenStorage.getCurrentStudent().id)
  .subscribe((studentPayments1: StudentPayment[])=>{
      this.studentPayments = studentPayments1
    })
  }
}
