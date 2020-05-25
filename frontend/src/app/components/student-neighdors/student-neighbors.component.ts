import { Component, OnInit } from '@angular/core';
import {TokenStorage} from '../../token.storage';
import {StudentRoomService} from '../../services/student-room/student-room.service';
import {StudentPayment} from '../../model/student-peyment/student-payment';
import {StudentRoom} from '../../model/student-room/student-room';
import {Group} from '../../model/group/group';
import {GroupService} from '../../services/group/group.service';

@Component({
  selector: 'app-student-neighdors',
  templateUrl: './student-neighbors.component.html',
  styleUrls: ['./student-neighbors.component.css']
})
export class StudentNeighborsComponent implements OnInit {

  public studentRooms: StudentRoom[] = [];
  public group?: number[] = [];

  constructor(public tokenStorage: TokenStorage,
              private groupService:GroupService,
              private studentRoomService:StudentRoomService) { }

  ngOnInit(): void {
    this.getStudentRoom();
  }

  getStudentRoom() {
    this.studentRoomService.getStudentRoomByStudentId(this.tokenStorage.getCurrentStudent().id)
      .subscribe((studentRoom1: StudentRoom) => {
        this.getStudentRooms(studentRoom1.roomId)
      });
  }

  getStudentRooms(id?:number) {
    this.studentRoomService.getAllByRoomId(id)
      .subscribe((studentRooms1: StudentRoom[])=>{
        this.studentRooms = studentRooms1;
        for (var _i = 0; _i < studentRooms1.length; _i++) {
          this.getGroup(studentRooms1[_i].studentId.group,_i);
        }


      })
  }

  getGroup(id:number,i:number) {
    this.groupService.getGroupById(id)
      .subscribe((group: Group) => {
        this.group[i] = group.studyNumber;
      });
  }

}
