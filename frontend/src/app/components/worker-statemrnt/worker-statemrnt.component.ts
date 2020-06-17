import { Component, OnInit } from '@angular/core';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {Statement} from '../../model/statement/statement';
import {StatementService} from '../../services/statement/statement.service';
import {TokenStorage} from '../../token.storage';

@Component({
  selector: 'app-worker-statemrnt',
  templateUrl: './worker-statemrnt.component.html',
  styleUrls: ['./worker-statemrnt.component.css']
})
export class WorkerStatemrntComponent implements OnInit {

  public  statements: Statement[];

  constructor(private modalService: NgbModal,
              private statementService: StatementService,
              public tokenStorage: TokenStorage) { }

  ngOnInit(): void {
    this.getStatement();
  }

  openModal(content) {
    const modalRef = this.modalService.open(content);
  }

  getStatement() {
    this.statementService.getByStaffId(this.tokenStorage.getCurrentStaff().id)
      .subscribe((statement: Statement[])=>{
        this.statements = statement;
      })
  }
}
