import { Component, OnInit } from '@angular/core';
import { TwitterUser } from '../twitterUser';
import { TwitterReportService } from '../twitter-report.service';

@Component({
  selector: 'app-top5followers',
  templateUrl: './top5followers.component.html',
  styleUrls: ['./top5followers.component.css']
})
export class Top5followersComponent implements OnInit {

  twitterUsers: TwitterUser[];
  selectedTwitterUser: TwitterUser;

  constructor(private twitterReportService: TwitterReportService) { }

  ngOnInit() {
    this.getTop5TwitterUsers();
  }

  onSelect(twitterUser: TwitterUser) {
    this.selectedTwitterUser = twitterUser;
  }

  getTop5TwitterUsers() : void {
    this.twitterReportService.getTop5TwitterUsers().subscribe(twitterUsers => this.twitterUsers = twitterUsers);
  }

}
