import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpByIdComponent } from './emp-by-id.component';

describe('EmpByIdComponent', () => {
  let component: EmpByIdComponent;
  let fixture: ComponentFixture<EmpByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmpByIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
