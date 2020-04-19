import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentNeighdorsComponent } from './student-neighdors.component';

describe('StudentNeighdorsComponent', () => {
  let component: StudentNeighdorsComponent;
  let fixture: ComponentFixture<StudentNeighdorsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentNeighdorsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentNeighdorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
