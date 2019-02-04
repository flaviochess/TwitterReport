import { Component, OnInit } from '@angular/core';
import { HashtagCountry } from '../hashtagCountry';
import { TwitterReportService } from '../twitter-report.service';

@Component({
  selector: 'app-hashtag-country',
  templateUrl: './hashtag-country.component.html',
  styleUrls: ['./hashtag-country.component.css']
})
export class HashtagCountryComponent implements OnInit {

  hashtagsCountrys: HashtagCountry[];

  constructor(private twitterReportService: TwitterReportService) { }

  ngOnInit() {
    this.getHashtagsByCountry();
  }

  getHashtagsByCountry() : void {
    this.twitterReportService.getHashtagsByCountry()
              .subscribe(hashtagsCountrys => this.hashtagsCountrys = hashtagsCountrys);
  }

}
