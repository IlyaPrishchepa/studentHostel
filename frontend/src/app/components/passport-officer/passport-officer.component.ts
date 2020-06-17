import { Component, OnInit } from '@angular/core';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {Student} from '../../model/student/student';

@Component({
  selector: 'app-passport-officer',
  templateUrl: './passport-officer.component.html',
  styleUrls: ['./passport-officer.component.css']
})
export class PassportOfficerComponent implements OnInit {

  selectStudent?: Student;

  constructor(private modalService: NgbModal
  ) { }

  ngOnInit(): void {
  }

  openModal(content, student) {
    this.selectStudent = student;
    this.modalService.open(content);
  }

  closeModal(): void {
    this.modalService.dismissAll();
  }
}
