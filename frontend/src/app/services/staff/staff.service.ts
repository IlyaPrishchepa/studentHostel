import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Role} from '../../model/role/role';
import {Staff} from '../../model/staff/staff';
import {Statement} from '../../model/statement/statement';
import {Observable} from 'rxjs';
import {Student} from '../../model/student/student';

@Injectable({
  providedIn: 'root'
})
export class StaffService {

  private staffUrl: string;

  constructor(private http: HttpClient) {
    this.staffUrl = 'http://localhost:8081/api/staff';
  }
  public getAllStaff(page:number, size:number) {
    return this.http.get<Staff[]>(this.staffUrl + '/find-all?pageNo=' + page + '&pageSize=' + size );
  }

  public getStaffByBaseId_RoleID(id:number) {
    return this.http.get<Staff[]>(this.staffUrl + '/find-by-baseId_RoleID/' + id );
  }

  public getStaffById(id:number) {
    return this.http.get<Staff>(this.staffUrl + '/' + id );
  }

  getStaffByBaseId(baseId: number): Observable<Staff> {
    return this.http.get<Staff>(this.staffUrl + '/find-byBaseId/' + baseId);
  }
}
