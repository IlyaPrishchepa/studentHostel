import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Group} from '../../model/group/group';
import {Payment} from '../../model/payment/payment';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  private paymentUri: string;

  constructor(private http: HttpClient) {
    this.paymentUri = 'http://localhost:8081/api/payment';
  }

  getById(id: number): Observable<Payment> {
    return this.http.get<Payment>(this.paymentUri +
      '/' + id);
  }

}
