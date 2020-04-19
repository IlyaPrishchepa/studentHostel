import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MainHomePageComponent} from './pages/main-home-page/main-home-page.component';
import {RegistrationPageComponent} from './pages/registration-page/registration-page.component';
import {LogInPageComponent} from './pages/log-in-page/log-in-page.component';
import {StudentHomePageComponent} from './pages/student-home-page/student-home-page.component';
import {StudentDutyPageComponent} from './pages/student-duty-page/student-duty-page.component';
import {StudentNeighdorsPageComponent} from './pages/student-neighdors-page/student-neighdors-page.component';
import {StudentPaymentPageComponent} from './pages/student-payment-page/student-payment-page.component';
import {StudentStatementPageComponent} from './pages/student-statement-page/student-statement-page.component';


const routes: Routes = [
  {path: '',component: MainHomePageComponent},
  {path: 'registration',component: RegistrationPageComponent},
  {path: 'log-in',component: LogInPageComponent},
  {path: 'student-home',component: StudentHomePageComponent},
  {path: 'student-payment',component: StudentPaymentPageComponent},
  {path: 'student-statement',component: StudentStatementPageComponent},
  {path: 'student-neighbors',component: StudentNeighdorsPageComponent},
  {path: 'student-duty',component: StudentDutyPageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
