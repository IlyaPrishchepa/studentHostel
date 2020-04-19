import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentStatementPageComponent } from './student-statement-page.component';

describe('StudentStatementPageComponent', () => {
  let component: StudentStatementPageComponent;
  let fixture: ComponentFixture<StudentStatementPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentStatementPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentStatementPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
