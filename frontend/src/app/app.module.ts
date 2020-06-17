import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppComponent } from './app.component';
import {Interceptor} from './app.interceptor';
import {NgbDropdownModule, NgbModule, NgbPaginationModule} from '@ng-bootstrap/ng-bootstrap';
import { HeaderMainComponent } from './components/header/header-main/header-main.component';
import { MainHomePageComponent } from './pages/main-home-page/main-home-page.component';
import { MainHomeComponent } from './components/main-home/main-home.component';
import { FooterComponent } from './components/footer/footer.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { RegistrationPageComponent } from './pages/registration-page/registration-page.component';
import { LogInComponent } from './components/log-in/log-in.component';
import { LogInPageComponent } from './pages/log-in-page/log-in-page.component';
import { StudentHomeComponent } from './components/student-home/student-home.component';
import { StudentHomePageComponent } from './pages/student-home-page/student-home-page.component';
import { StudentHeaderComponent } from './components/header/student-header/student-header.component';
import { StudentDutyComponent } from './components/student-duty/student-duty.component';
import { StudentDutyPageComponent } from './pages/student-duty-page/student-duty-page.component';
import { StudentPaymentPageComponent } from './pages/student-payment-page/student-payment-page.component';
import { StudentPaymentComponent } from './components/student-payment/student-payment.component';
import { StudentStatementComponent } from './components/student-statement/student-statement.component';
import { StudentStatementPageComponent } from './pages/student-statement-page/student-statement-page.component';
import { StudentNeighdorsPageComponent } from './pages/student-neighdors-page/student-neighdors-page.component';
import { StudentNeighborsComponent } from './components/student-neighdors/student-neighbors.component';
import {TokenStorage} from './token.storage';
import { PassportOfficerComponent } from './components/passport-officer/passport-officer.component';
import { PassportOfficerPageComponent } from './pages/passport-officer-page/passport-officer-page.component';
import { PassportOfficerHeaderComponent } from './components/header/passport-officer-header/passport-officer-header.component';
import { PaymentListComponent } from './components/payment-list/payment-list.component';
import { PaymentPageComponent } from './pages/payment-page/payment-page.component';
import { WorkerStatemrntPageComponent } from './pages/worker-statemrnt-page/worker-statemrnt-page.component';
import { WorkerStatemrntComponent } from './components/worker-statemrnt/worker-statemrnt.component';
import { WorkerHeaderComponent } from './components/header/worker-header/worker-header.component';
import { AdminListStudentComponent } from './components/admin-list-student/admin-list-student.component';
import { AdminListStudentPageComponent } from './pages/admin-list-student-page/admin-list-student-page.component';
import { AdminListEmployeePageComponent } from './pages/admin-list-employee-page/admin-list-employee-page.component';
import { AdminListEmployeeComponent } from './components/admin-list-employee/admin-list-employee.component';
import { AdminListRoomComponent } from './components/admin-list-room/admin-list-room.component';
import { AdminListRoomPageComponent } from './pages/admin-list-room-page/admin-list-room-page.component';
import { AdminHeaderComponent } from './components/header/admin-header/admin-header.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderMainComponent,
    MainHomePageComponent,
    MainHomeComponent,
    FooterComponent,
    RegistrationComponent,
    RegistrationPageComponent,
    LogInComponent,
    LogInPageComponent,
    StudentHomeComponent,
    StudentHomePageComponent,
    StudentHeaderComponent,
    StudentDutyComponent,
    StudentDutyPageComponent,
    StudentPaymentPageComponent,
    StudentPaymentComponent,
    StudentStatementComponent,
    StudentStatementPageComponent,
    StudentNeighdorsPageComponent,
    StudentNeighborsComponent,
    PassportOfficerComponent,
    PassportOfficerPageComponent,
    PassportOfficerHeaderComponent,
    PaymentListComponent,
    PaymentPageComponent,
    WorkerStatemrntPageComponent,
    WorkerStatemrntComponent,
    WorkerHeaderComponent,
    AdminListStudentComponent,
    AdminListStudentPageComponent,
    AdminListEmployeePageComponent,
    AdminListEmployeeComponent,
    AdminListRoomComponent,
    AdminListRoomPageComponent,
    AdminHeaderComponent,
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    NgbDropdownModule,
    NgbModule,
    NgbPaginationModule
  ],
  providers: [
    TokenStorage,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: Interceptor,
      multi: true
    }],
  bootstrap: [AppComponent]
})
export class AppModule { }
