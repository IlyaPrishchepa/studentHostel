import {Injectable} from "@angular/core";
import {Student} from './model/student/student';

@Injectable()
export class TokenStorage {

  private readonly TOKEN_KEY: string = "token";
  private readonly CURRENT_STUDENT: string = "currentStudent";

  private currentStudent: Student;

  public setCurrentStudent(currentStudent: Student): void {
    this.currentStudent = currentStudent;
    localStorage.setItem(this.CURRENT_STUDENT, JSON.stringify(currentStudent));
  }

  public getCurrentStudent(): Student {
    return this.currentStudent || JSON.parse(localStorage.getItem(this.CURRENT_STUDENT));
  }

  public clearStudent(): void {
    localStorage.setItem(this.CURRENT_STUDENT, null);
  }


  public setToken(token: string): void {
    localStorage.setItem(this.TOKEN_KEY, token);
  }

  public getToken(): string {
    return localStorage.getItem(this.TOKEN_KEY);
  }

  public clearToken(): void {
    localStorage.setItem(this.TOKEN_KEY, null);
  }

}
