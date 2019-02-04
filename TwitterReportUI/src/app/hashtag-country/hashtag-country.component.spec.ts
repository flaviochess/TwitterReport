import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HashtagCountryComponent } from './hashtag-country.component';

describe('HashtagCountryComponent', () => {
  let component: HashtagCountryComponent;
  let fixture: ComponentFixture<HashtagCountryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HashtagCountryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HashtagCountryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
