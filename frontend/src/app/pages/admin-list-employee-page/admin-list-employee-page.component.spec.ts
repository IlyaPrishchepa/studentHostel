import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminListEmployeePageComponent } from './admin-list-employee-page.component';

describe('AdminListEmployeePageComponent', () => {
  let component: AdminListEmployeePageComponent;
  let fixture: ComponentFixture<AdminListEmployeePageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminListEmployeePageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminListEmployeePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
