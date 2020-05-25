import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Reprimand} from '../../model/reprimand/reprimand';

@Injectable({
  providedIn: 'root'
})
export class ReprimandService {

  private reprimandUri: string;

  constructor(private http: HttpClient) {
    this.reprimandUri = 'http://localhost:8081/api/reprimand';
  }

  getById(id: number): Observable<Reprimand> {
    return this.http.get<Reprimand>(this.reprimandUri +
      '/' + id);
  }
}
