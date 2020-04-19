import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentNeighdorsPageComponent } from './student-neighdors-page.component';

describe('StudentNeighdorsPageComponent', () => {
  let component: StudentNeighdorsPageComponent;
  let fixture: ComponentFixture<StudentNeighdorsPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentNeighdorsPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentNeighdorsPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
