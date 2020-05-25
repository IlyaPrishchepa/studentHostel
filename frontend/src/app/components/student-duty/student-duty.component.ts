import { Component, OnInit } from '@angular/core';
import {StudentPayment} from '../../model/student-peyment/student-payment';
import {TokenStorage} from '../../token.storage';
import {StudentPaymentService} from '../../services/studen-payment/student-payment.service';
import {Duty} from '../../model/duty/duty';
import {DutyService} from '../../services/duty/duty.service';
import {DutyTypeService} from '../../services/duty-type/duty-type.service';
import {DutyType} from '../../model/duty-type/duty-type';

@Component({
  selector: 'app-student-duty',
  templateUrl: './student-duty.component.html',
  styleUrls: ['./student-duty.component.css']
})
export class StudentDutyComponent implements OnInit {

  public duty1?: Duty[] = [];
  public duty2?: Duty[] = [];
  public dutyType?: DutyType[] = [];
  public counter1?:number = 0;
  public counter2?:number = 0;


  constructor(public tokenStorage: TokenStorage,
              private dutyService:DutyService,
              private dutyTypeService:DutyTypeService,
              ) { }

  ngOnInit(): void {
    this.getDutyTypeSize();
  }

  getDutyTypeSize() {
    this.dutyTypeService.getSize().subscribe
    ((size: number) => {
      this.getAllDutyType(1,size);
    });
  }

  getAllDutyType(page?: number, size?: number) {
    this.dutyTypeService.getAllDutyType(page,size)
      .subscribe((dutyTypes: DutyType[])=>{
        this.dutyType = dutyTypes;
        this.getDutySize()
      })
  }

  getDutySize() {
    this.dutyService.getSize().subscribe
    ((size: number) => {
      this.sortByDutyType(1,size)
    });
  }

  sortByDutyType(page?: number, size?: number) {
    this.dutyService.getAllDuty(page,size)
      .subscribe((dutys: Duty[])=>{
        for (var _i = 0; _i < dutys.length; _i++) {
          if (dutys[_i].dutyTypeId == this.dutyType[0].id)
          {

            this.duty1[this.counter1] = dutys[_i];
            this.counter1 += 1;
          }
          else
          {
            this.duty2[this.counter2] = dutys[_i];
            this.counter2 += 1;
          }
        }
      })
  }

}
