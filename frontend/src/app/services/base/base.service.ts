import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Base} from '../../model/base/base';

@Injectable({
  providedIn: 'root'
})
export class BaseService {

  private tokenUrl: string;
  private getBaseUrl: string;

  constructor(private http: HttpClient) {
    this.tokenUrl = 'http://localhost:8081/token/generate-token';
    this.getBaseUrl = 'http://localhost:8081/api/base/get-current-base';
  }

  public authenticate(login: string, password: string): Observable<any> {
    const userDetails = {login: login, password: password};
    return this.http.post<any>(this.tokenUrl, userDetails);
  }

  getBase(): Observable<Base> {
    return this.http.get<Base>(this.getBaseUrl);
  }
}
