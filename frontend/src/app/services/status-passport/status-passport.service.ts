import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {StudentRoom} from '../../model/student-room/student-room';
import {Group} from '../../model/group/group';

@Injectable({
  providedIn: 'root'
})
export class StatusPassportService {

  private statusPassportUri: string;

  constructor(private http: HttpClient) {
    this.statusPassportUri = 'http://localhost:8081/api/status-passport';
  }

  getStatusPassportById(id: number): Observable<StudentRoom> {
    return this.http.get<Group>(this.statusPassportUri +
      '/' + id);
  }
}
