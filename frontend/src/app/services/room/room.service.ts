import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Room} from '../../model/room/room';

@Injectable({
  providedIn: 'root'
})
export class RoomService {

  private roomUri: string;

  constructor(private http: HttpClient) {
    this.roomUri = 'http://localhost:8081/api/room';
  }

  getRoomById(id: number): Observable<Room> {
    return this.http.get<Room>(this.roomUri +
      '/' + id);
  }
}
