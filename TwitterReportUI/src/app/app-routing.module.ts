import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Top5followersComponent } from './top5followers/top5followers.component';
import { TotalTweetComponent } from './total-tweet/total-tweet.component';
import { HashtagCountryComponent } from './hashtag-country/hashtag-country.component';

const routes: Routes = [
  { path: '', redirectTo: '/', pathMatch: 'full' },
  { path: 'top5', component: Top5followersComponent },
  { path: 'tweet-hour', component: TotalTweetComponent },
  { path: 'hashtag-country', component: HashtagCountryComponent }
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
