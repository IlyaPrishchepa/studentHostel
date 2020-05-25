import {Payment} from '../payment/payment';

export class StudentPayment {
  id?: number;
  date?:Date;
  amount?: number;
  studentId?: number;
  paymentId?: Payment;
}
