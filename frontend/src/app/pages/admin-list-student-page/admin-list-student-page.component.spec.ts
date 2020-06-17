import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminListStudentPageComponent } from './admin-list-student-page.component';

describe('AdminListStudentPageComponent', () => {
  let component: AdminListStudentPageComponent;
  let fixture: ComponentFixture<AdminListStudentPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminListStudentPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminListStudentPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
