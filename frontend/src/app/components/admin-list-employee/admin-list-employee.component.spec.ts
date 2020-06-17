import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminListEmployeeComponent } from './admin-list-employee.component';

describe('AdminListEmployeeComponent', () => {
  let component: AdminListEmployeeComponent;
  let fixture: ComponentFixture<AdminListEmployeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminListEmployeeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminListEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
