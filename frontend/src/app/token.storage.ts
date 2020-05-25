import {Injectable} from "@angular/core";
import {Student} from './model/student/student';
import {Base} from './model/base/base';

@Injectable()
export class TokenStorage {

  private readonly TOKEN_KEY: string = "token";
  private readonly CURRENT_STUDENT: string = "currentStudent";
  private readonly CURRENT_BASE: string = "currentBase";

  private currentStudent: Student;
  private currentBase: Base;

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

  public setCurrentBase(currentBase: Base): void {
    this.currentBase = currentBase;
    localStorage.setItem(this.CURRENT_BASE, JSON.stringify(currentBase));
  }

  public getCurrentBase(): Base {
    return this.currentBase || JSON.parse(localStorage.getItem(this.CURRENT_BASE));
  }

  public clearBase(): void {
    localStorage.setItem(this.CURRENT_BASE, null);
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

  public clearAll(): void {
    localStorage.setItem(this.TOKEN_KEY, null);
    localStorage.setItem(this.CURRENT_BASE, null);
    localStorage.setItem(this.CURRENT_STUDENT, null);
  }

}
