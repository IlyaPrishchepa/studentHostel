import { Component, OnInit } from '@angular/core';
import {TokenStorage} from '../../token.storage';
import {Staff} from '../../model/staff/staff';
import {StaffService} from '../../services/staff/staff.service';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {StatementService} from '../../services/statement/statement.service';
import {Statement} from '../../model/statement/statement';
import {StatusStatement} from '../../model/status-statement/status-statement';
import {StatusStatementService} from '../../services/status-statement/status-statement.service';


@Component({
  selector: 'app-student-statement',
  templateUrl: './student-statement.component.html',
  styleUrls: ['./student-statement.component.css']
})
export class StudentStatementComponent implements OnInit {

  public roleID:number = 3;

  public selectStaff?: number;
  public statement?: Statement = {};
  public description?:string;
  public staffs: Staff[] = [];
  public statementStaffs: Staff[] = [];
  public statements?: Statement[] = [];
  public statementStatus?: StatusStatement[] = [];

  constructor(public tokenStorage: TokenStorage,
              private modalService: NgbModal,
              private staffService:StaffService,
              private statusStatementService:StatusStatementService,
              private statementService:StatementService) { }

  ngOnInit(): void {
    this.getStaff();
    this.getStatement()
  }

  getStaff() {
    this.staffService.getStaffByBaseId_RoleID(this.roleID)
      .subscribe((staff: Staff[])=>{
        this.staffs = staff
      })
  }

  getStaffByID(id?: number, i?: number) {
    this.staffService.getStaffById(id)
      .subscribe((staff1: Staff)=>{
        this.statementStaffs[i] = staff1;
      })
  }

  getStatusStatementByID(id?: number, i?: number) {
    this.statusStatementService.getById(id)
      .subscribe((statementStatus: StatusStatement)=>{
        this.statementStatus[i] = statementStatus;
      })
  }

  getStatement() {
    this.statementService.getByStudentId(this.tokenStorage.getCurrentStudent().id)
      .subscribe((statements1: Statement[])=>{
        this.statements = statements1
        for (var _i = 0; _i < statements1.length; _i++) {
          this.getStaffByID(statements1[_i].staffId,_i);
          this.getStatusStatementByID(statements1[_i].statusStatementId,_i);
        }
      })
  }

  openModal(content, staff) {
    this.selectStaff = staff;
    this.modalService.open(content);
  }

  closeModal(): void {
    this.modalService.dismissAll();
  }

  create(){
    this.statement.description =this.description;
    this.statement.staffId = this.staffs[this.selectStaff].id;
    this.statement.studentId = this.tokenStorage.getCurrentStudent().id;
    this.statementService.create(this.statement).subscribe(() => {this.ngOnInit()})
    this.closeModal();
  }
}
