import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Group} from '../../model/group/group';
import {WorkingOff} from '../../model/working-off/working-off';

@Injectable({
  providedIn: 'root'
})
export class WorkingOffService {

  private workingOffUri: string;

  constructor(private http: HttpClient) {
    this.workingOffUri = 'http://localhost:8081/api/working-off';
  }

  getByStudentId(id: number): Observable<WorkingOff> {
    return this.http.get<Group>(this.workingOffUri +
      '/find-by-StudentId/' + id);
  }
}
