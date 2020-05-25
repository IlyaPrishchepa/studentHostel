import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {TokenStorage} from '../../../token.storage';

@Component({
  selector: 'app-student-header',
  templateUrl: './student-header.component.html',
  styleUrls: ['./student-header.component.css']
})
export class StudentHeaderComponent implements OnInit {

  constructor(private router: Router,
              private tokenStorage: TokenStorage) { }

  ngOnInit(): void {
  }

  login() {
    this.tokenStorage.clearAll();
    this.router.navigateByUrl('');
  }

}
