import { Component, OnInit } from '@angular/core';
import { HashtagCountry } from '../hashtagCountry';
import { TwitterReportService } from '../twitter-report.service';
import { HashtagLanguage } from '../hashtagLanguage';
import { CountryAmount } from '../countryAmount';

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
    this.twitterReportService.getHashtagsByLanguage()
              .subscribe(hashtagsLanguage => this.hashtagsCountrys = this.convert(hashtagsLanguage));
  }

  convert(hasttagsLanguage: HashtagLanguage[]) : HashtagCountry[] {

    let resultArray: HashtagCountry[] = [];

    let mapResult = new Map<String, CountryAmount[]>();

    hasttagsLanguage.forEach(function(value) {

      let countryRow = new CountryAmount();

      countryRow.country = value.language;
      countryRow.amount = value.count;

      if(mapResult.has(value.hashtag)) {
        let countryAmounts = mapResult.get(value.hashtag);
        countryAmounts.push(countryRow);

      } else {
        mapResult.set(value.hashtag, [countryRow]);
      }
    });

    mapResult.forEach((value: CountryAmount[], key: string) => {

      console.log(value);
      let hashtagCountry = new HashtagCountry();
      hashtagCountry.hashtag = key;
      hashtagCountry.countrysAmount = value;

      resultArray.push(hashtagCountry);
    });

    return resultArray;
  } 

}
