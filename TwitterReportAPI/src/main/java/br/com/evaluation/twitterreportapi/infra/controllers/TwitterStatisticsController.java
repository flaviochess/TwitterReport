package br.com.evaluation.twitterreportapi.infra.controllers;

import br.com.evaluation.twitterreportapi.domain.usecases.ReportAmountHashtagByLanguage;
import br.com.evaluation.twitterreportapi.domain.usecases.ReportAmountTweetsHourly;
import br.com.evaluation.twitterreportapi.domain.usecases.SearchUsersWithMoreFollowers;
import br.com.evaluation.twitterreportapi.infra.dtos.AmountHashtagLanguageDto;
import br.com.evaluation.twitterreportapi.infra.dtos.AmountTweetsHourDto;
import br.com.evaluation.twitterreportapi.infra.dtos.UserFollowersDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("twitter")
public class TwitterStatisticsController {

    private final SearchUsersWithMoreFollowers searchUsersWithMoreFollowers;

    private final ReportAmountTweetsHourly reportAmountTweetsHourly;

    private final ReportAmountHashtagByLanguage reportAmountHashtagByLanguage;

    @Autowired
    public TwitterStatisticsController(SearchUsersWithMoreFollowers searchUsersWithMoreFollowers, ReportAmountTweetsHourly reportAmountTweetsHourly, ReportAmountHashtagByLanguage reportAmountHashtagByLanguage) {
        this.searchUsersWithMoreFollowers = searchUsersWithMoreFollowers;
        this.reportAmountTweetsHourly = reportAmountTweetsHourly;
        this.reportAmountHashtagByLanguage = reportAmountHashtagByLanguage;
    }

    @GetMapping("/top-users/{amount}")
    public List<UserFollowersDto> searchUsersWithMoreFollowers(@PathVariable("amount") int amount) {

        return searchUsersWithMoreFollowers.search(amount);
    }

    @GetMapping("/report-tweets-hourly")
    public List<AmountTweetsHourDto> reportAmountTweetsHourly() {

        return reportAmountTweetsHourly.get();
    }

    @GetMapping("/report-hashtag-language")
    public List<AmountHashtagLanguageDto> reportAmountHashtagByLanguage() {

        return reportAmountHashtagByLanguage.get();
    }

}
