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
import {PassportOfficerPageComponent} from './pages/passport-officer-page/passport-officer-page.component';
import {PaymentPageComponent} from './pages/payment-page/payment-page.component';
import {WorkerStatemrntPageComponent} from './pages/worker-statemrnt-page/worker-statemrnt-page.component';
import {AdminListEmployeePageComponent} from './pages/admin-list-employee-page/admin-list-employee-page.component';
import {AdminListRoomPageComponent} from './pages/admin-list-room-page/admin-list-room-page.component';
import {AdminListStudentPageComponent} from './pages/admin-list-student-page/admin-list-student-page.component';

const routes: Routes = [
  {path: '',component: MainHomePageComponent},
  {path: 'registration',component: RegistrationPageComponent},
  {path: 'log-in',component: LogInPageComponent},
  {path: 'student-home',component: StudentHomePageComponent},
  {path: 'student-payment',component: StudentPaymentPageComponent},
  {path: 'student-statement',component: StudentStatementPageComponent},
  {path: 'student-neighbors',component: StudentNeighdorsPageComponent},
  {path: 'student-duty',component: StudentDutyPageComponent},
  {path: 'passport-officer', component: PassportOfficerPageComponent},
  {path: 'payment-list', component: PaymentPageComponent},
  {path: 'worker-statement', component: WorkerStatemrntPageComponent},
  {path: 'admin-list-employee', component:AdminListEmployeePageComponent},
  {path: 'admin-list-student', component:AdminListStudentPageComponent},
  {path: 'admin-list-room', component:AdminListRoomPageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
