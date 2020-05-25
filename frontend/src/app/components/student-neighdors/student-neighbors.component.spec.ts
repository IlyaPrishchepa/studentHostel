import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentNeighborsComponent } from './student-neighbors.component';

describe('StudentNeighborsComponent', () => {
  let component: StudentNeighborsComponent;
  let fixture: ComponentFixture<StudentNeighborsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentNeighborsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentNeighborsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
