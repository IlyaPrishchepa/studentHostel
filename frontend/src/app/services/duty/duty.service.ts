import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Group} from '../../model/group/group';
import {Duty} from '../../model/duty/duty';

@Injectable({
  providedIn: 'root'
})
export class DutyService {

  private dutyUrl: string;

  constructor(private http: HttpClient) {
    this.dutyUrl = 'http://localhost:8081/api/duty';
  }

  public getAllDuty(page:number, size:number) {
    return this.http.get<Duty[]>(this.dutyUrl + '/find-all/?pageNo=' + page + '&pageSize=' + size );
  }

  public getSize() {
    return this.http.get<number>(this.dutyUrl + '/size');
  }
}
