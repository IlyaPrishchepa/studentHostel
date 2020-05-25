import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {BaseService} from '../../services/base/base.service';
import {TokenStorage} from '../../token.storage';
import {StudentService} from '../../services/student/student.service';
import {RoleService} from '../../services/role/role.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent implements OnInit {


  public loginForm;
  public showValidationMessages: boolean = false;

  constructor(private router: Router,
              private baseService: BaseService,
              private tokenStorage: TokenStorage,
              private studentService: StudentService,
              private roleService:RoleService) {
  }

  public logIn(): void {
    if (!this.loginForm.get("login").valid || !this.loginForm.get("password").valid) {
      this.showValidationMessages = true;
    } else {
      this.baseService.authenticate(this.loginForm.get("login").value, this.loginForm.get("password").value).subscribe(
        data => {
          this.tokenStorage.setToken(data.token);
          this.baseService.getBase().subscribe(base => {
            this.tokenStorage.setCurrentBase(base);
            if (base.roleId == 1) {
              this.studentService.getUserByBaseId(base.id).subscribe(user => {
                this.tokenStorage.setCurrentStudent(user)
              });
              this.router.navigateByUrl('student-home');
            }
          });

        },
        error => {
          console.log(error);
        });
    }

  }

  ngOnInit() {
    this.loginForm = new FormGroup({
      login: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', Validators.required),
    });
  }

}
