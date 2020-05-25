import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Student} from '../../model/student/student';
import {Observable} from 'rxjs';
import {RegStudent} from '../../model/reg-student/reg-student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private studentUrl: string;
  private regStudentUrl: string;

  constructor(private http: HttpClient) {
    this.studentUrl = 'http://localhost:8081/api/student';
    this.regStudentUrl = 'http://localhost:8081/api/registration-student';
  }


  registration(regStudent: RegStudent): Observable<RegStudent> {
    return this.http.post<RegStudent>(this.regStudentUrl, regStudent);
  }

  getUserByBaseId(baseId: number): Observable<Student> {
    return this.http.get<Student>(this.studentUrl + '/find-byBaseId/' + baseId);
  }
}
