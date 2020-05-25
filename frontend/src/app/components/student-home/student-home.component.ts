import { Component, OnInit } from '@angular/core';
import {TokenStorage} from '../../token.storage';
import {GroupService} from '../../services/group/group.service';
import {Group} from '../../model/group/group';
import {RegStudent} from '../../model/reg-student/reg-student';
import {StudentRoomService} from '../../services/student-room/student-room.service';
import {StudentRoom} from '../../model/student-room/student-room';
import {RoomService} from '../../services/room/room.service';
import {Room} from '../../model/room/room';
import {StatusPassport} from '../../model/status-passport/status-passport';
import {StatusPassportService} from '../../services/status-passport/status-passport.service';
import {StudentPayment} from '../../model/student-peyment/student-payment';
import {WorkingOff} from '../../model/working-off/working-off';
import {Reprimand} from '../../model/reprimand/reprimand';
import {StudentPaymentService} from '../../services/studen-payment/student-payment.service';
import {WorkingOffService} from '../../services/working-off/working-off.service';
import {StudentReprimandService} from '../../services/student-reprimand/student-reprimand.service';
import {StudentReprimand} from '../../model/student-reprimand/student-reprimand';
import {ReprimandService} from '../../services/reprimand/reprimand.service';

@Component({
  selector: 'app-student-home',
  templateUrl: './student-home.component.html',
  styleUrls: ['./student-home.component.css']
})
export class StudentHomeComponent implements OnInit {

  studentGroup: Group;
  studentRoom: StudentRoom;
  paymentArrears: number = 0;
  workingOff: WorkingOff;
  studentReprimand: StudentReprimand;
  reprimand: Reprimand;
  room: Room;
  statusPassport: StatusPassport;

  constructor(public tokenStorage: TokenStorage,
              private groupService:GroupService,
              private studentRoomService:StudentRoomService,
              private roomService:RoomService,
              private studentPaymentService:StudentPaymentService,
              private workingOffService:WorkingOffService,
              private studentReprimandService:StudentReprimandService,
              private reprimandService:ReprimandService,
              private statusPassportService: StatusPassportService) {
    this.studentGroup = new Group();
    this.studentRoom = new StudentRoom();
    this.workingOff = new WorkingOff();
    this.studentReprimand = new StudentReprimand();
    this.reprimand = new Reprimand();
    this.room = new Room();
    this.statusPassport = new StatusPassport();
  }

  ngOnInit(): void {
    this.getGroup();
    this.getStudentRoom();
    this.getStatusPassport();
    this.getPaymentArrears();
    this.getStudentReprimand();
    this.getWorkingOff();
  }

  getGroup() {
    this.groupService.getGroupById(this.tokenStorage.getCurrentStudent().group)
      .subscribe((group: Group) => {
        this.studentGroup = group;
      });
  }

  getStudentRoom() {
    this.studentRoomService.getStudentRoomByStudentId(this.tokenStorage.getCurrentStudent().id)
      .subscribe((studentRoom1: StudentRoom) => {
        this.studentRoom = studentRoom1;
        this.getRoom(studentRoom1.roomId)
      });
  }

  getRoom(id:number) {
    this.roomService.getRoomById(id)
      .subscribe((room1: Room) => {
        this.room = room1;
      });
  }

  getStatusPassport() {
    this.statusPassportService.getStatusPassportById(
      this.tokenStorage.getCurrentStudent().statusPassportId)
      .subscribe((statusPassport1: StatusPassport) => {
        this.statusPassport = statusPassport1;
      });
  }

  getPaymentArrears() {
    this.studentPaymentService.paymentArrears(this.tokenStorage.getCurrentStudent().id)
      .subscribe((paymentArrears: number) => {
        this.paymentArrears = paymentArrears;
      });
  }

  getWorkingOff() {
    this.workingOffService.getByStudentId(this.tokenStorage.getCurrentStudent().id)
      .subscribe((workingOff1: WorkingOff) => {
        this.workingOff = workingOff1;
      });
  }

  getStudentReprimand() {
    this.studentReprimandService.getByStudentId(this.tokenStorage.getCurrentStudent().id)
      .subscribe((studentReprimand1: StudentReprimand) => {
        this.studentReprimand = studentReprimand1;
        this.getReprimand(studentReprimand1.reprimandId)
      });
  }

  getReprimand(id:number) {
    this.reprimandService.getById(id)
      .subscribe((reprimand1: Reprimand) => {
        this.reprimand = reprimand1;
      });
  }
}
