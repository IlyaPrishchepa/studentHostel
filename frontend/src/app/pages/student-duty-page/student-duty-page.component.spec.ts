import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentDutyPageComponent } from './student-duty-page.component';

describe('StudentDutyPageComponent', () => {
  let component: StudentDutyPageComponent;
  let fixture: ComponentFixture<StudentDutyPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentDutyPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentDutyPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
