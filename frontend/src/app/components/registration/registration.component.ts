import { Component, OnInit } from '@angular/core';

import {GroupService} from "../../services/group/group.service";
import {Group} from '../../model/group/group';
import {ActivatedRoute, Router} from '@angular/router';
import {Subscription} from 'rxjs';
import {StudentService} from '../../services/student/student.service';
import {RegStudent} from '../../model/reg-student/reg-student';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  private subscriptionsRxjs: Subscription[] = [];

  regStudent: RegStudent;
  public groups: Group[] = [];
  selectGroup: Group;
  public pageSize: number = 100; /*костыль*/

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private groupService: GroupService,
    private studentService: StudentService) {
    this.getSize()
    this.regStudent = new RegStudent();
    this.getGroup(1,this.pageSize);
  }

  ngOnInit(): void {
  }

  signIn(): void {
    this.subscriptionsRxjs.push(
      this.studentService.registration(this.regStudent).subscribe(data => {
          this.regStudent = data;
          alert('Ok');
          this.router.navigateByUrl('log-in');
        },
        error => {
          alert('Error xxx');
          console.log(error);
        })
    );
  }

  getGroup(page:number,size:number) {
    this.groupService.getGroup(page,size)
      .subscribe((group: Group[]) => {
        this.groups = group
      });
  }

  getSize() {
    this.groupService.getSize().subscribe
    ((size: number) => {
      this.pageSize = size
    });
  }


  onFileSelected(event:Blob){
    this.regStudent.photo = event;
  }

  onChangeGroup(select:Group){
    this.regStudent.group = select.id;
  }

}
