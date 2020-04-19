import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppComponent } from './app.component';
import {Interceptor} from './app.interceptor';
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
import { StudentNeighdorsComponent } from './components/student-neighdors/student-neighdors.component';

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
    StudentNeighdorsComponent,
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: Interceptor,
      multi: true
    }],
  bootstrap: [AppComponent]
})
export class AppModule { }
