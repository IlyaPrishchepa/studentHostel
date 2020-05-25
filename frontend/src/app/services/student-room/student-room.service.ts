import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Group} from '../../model/group/group';
import {Observable} from 'rxjs';
import {StudentRoom} from '../../model/student-room/student-room';

@Injectable({
  providedIn: 'root'
})
export class StudentRoomService {

  private sudentRoomUri: string;

  constructor(private http: HttpClient) {
    this.sudentRoomUri = 'http://localhost:8081/api/student-room';
  }

  getStudentRoomByStudentId(id: number): Observable<StudentRoom> {
    return this.http.get<Group>(this.sudentRoomUri +
      '/find-studentRoom-by-StudentId/' + id);
  }

  public getAllByRoomId(id: number): Observable<StudentRoom[]> {
    return this.http.get<StudentRoom[]>(this.sudentRoomUri+"/find-by-roomId/"+ id);
  }
}
