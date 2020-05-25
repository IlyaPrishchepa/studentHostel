import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Group} from '../../model/group/group';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GroupService {

  private groupUrl: string;

  constructor(private http: HttpClient) {
    this.groupUrl = 'http://localhost:8081/api/group';
  }

  public getGroup(page:number, size:number) {
    return this.http.get<Group[]>(this.groupUrl + '/find-all/?pageNo=' + page + '&pageSize=' + size );
  }

  getGroupById(id: number): Observable<Group> {
    return this.http.get<Group>(this.groupUrl + '/' + id);
  }


  public getSize() {
    return this.http.get<number>(this.groupUrl + '/size');
  }


}
