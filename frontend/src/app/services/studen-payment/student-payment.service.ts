import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Group} from '../../model/group/group';
import {StudentPayment} from '../../model/student-peyment/student-payment';

@Injectable({
  providedIn: 'root'
})
export class StudentPaymentService {

  private studentPaymentUri: string;

  constructor(private http: HttpClient) {
    this.studentPaymentUri = 'http://localhost:8081/api/student-payment';
  }

  getByStudentId(id: number): Observable<StudentPayment> {
    return this.http.get<Group>(this.studentPaymentUri +
      '/find-by-StudentId/' + id);
  }

  public getAllByStudentId(page: number,size: number, id: number): Observable<StudentPayment[]> {
    return this.http.get<StudentPayment[]>(this.studentPaymentUri+"/find-by-all-StudentId?page=" + page+ "&size="+size
    + "&id="+id);
  }

  public paymentArrears(id: number): Observable<number> {
    return this.http.get<number>(this.studentPaymentUri +
      '/payment-arrears/' + id);
  }
}
