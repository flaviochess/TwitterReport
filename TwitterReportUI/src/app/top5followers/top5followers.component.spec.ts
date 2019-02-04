import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Top5followersComponent } from './top5followers.component';

describe('Top5followersComponent', () => {
  let component: Top5followersComponent;
  let fixture: ComponentFixture<Top5followersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Top5followersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Top5followersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
