import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Statement} from '../../model/statement/statement';

@Injectable({
  providedIn: 'root'
})
export class StatementService {

  private statementUrl: string;

  constructor(private http: HttpClient) {
    this.statementUrl = 'http://localhost:8081/api/statement';
  }


  create(statement: Statement): Observable<Statement> {
    return this.http.post<Statement>(this.statementUrl, statement);
  }

  public getByStudentId(id:number) {
    return this.http.get<Statement[]>(this.statementUrl + '/find-by-StudentId/' + id );
  }

  public getByStaffId(id:number) {
    return this.http.get<Statement[]>(this.statementUrl + '/find-by-StaffId/' + id );
  }
}
