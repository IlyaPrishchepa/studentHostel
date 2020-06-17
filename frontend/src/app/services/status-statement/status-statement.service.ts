import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Group} from '../../model/group/group';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StatusStatementService {

  private groupUrl: string;

  constructor(private http: HttpClient) {
    this.groupUrl = 'http://localhost:8081/api/status-statement';
  }


  getById(id: number): Observable<Group> {
    return this.http.get<Group>(this.groupUrl + '/' + id);
  }
}
