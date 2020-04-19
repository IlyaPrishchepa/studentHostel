import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentDutyComponent } from './student-duty.component';

describe('StudentDutyComponent', () => {
  let component: StudentDutyComponent;
  let fixture: ComponentFixture<StudentDutyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentDutyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentDutyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
