import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Group} from '../../model/group/group';
import {StudentReprimand} from '../../model/student-reprimand/student-reprimand';

@Injectable({
  providedIn: 'root'
})
export class StudentReprimandService {

  private studentReprimandUri: string;

  constructor(private http: HttpClient) {
    this.studentReprimandUri = 'http://localhost:8081/api/student-reprimand';
  }

  getByStudentId(id: number): Observable<StudentReprimand> {
    return this.http.get<Group>(this.studentReprimandUri +
      '/find-by-StudentId/' + id);
  }
}
