import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Role} from '../../model/role/role';

@Injectable({
  providedIn: 'root'
})
export class RoleService {

  private roleUrl: string;

  constructor(private http: HttpClient) {
    this.roleUrl = 'http://localhost:8081/api/role';
  }
  public getRole(page:number, size:number) {
    return this.http.get<Role[]>(this.roleUrl + '?pageNo=' + page + '&pageSize=' + size );
  }
}
