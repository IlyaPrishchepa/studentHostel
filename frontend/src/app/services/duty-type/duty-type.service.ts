import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {DutyType} from '../../model/duty-type/duty-type';

@Injectable({
  providedIn: 'root'
})
export class DutyTypeService {

  private dutyTypeUrl: string;

  constructor(private http: HttpClient) {
    this.dutyTypeUrl = 'http://localhost:8081/api/duty-type';
  }

  public getAllDutyType(page:number, size:number) {
    return this.http.get<DutyType[]>(this.dutyTypeUrl + '/find-all/?pageNo=' + page + '&pageSize=' + size );
  }

  public getSize() {
    return this.http.get<number>(this.dutyTypeUrl + '/size');
  }
}
