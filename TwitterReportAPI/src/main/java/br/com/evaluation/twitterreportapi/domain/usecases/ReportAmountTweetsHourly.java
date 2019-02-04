package br.com.evaluation.twitterreportapi.domain.usecases;

import br.com.evaluation.twitterreportapi.infra.dtos.AmountTweetsHourDto;
import br.com.evaluation.twitterreportapi.infra.repositories.TweetEntityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportAmountTweetsHourly {

    private final TweetEntityRepository tweetRepository;

    @Autowired
    public ReportAmountTweetsHourly(TweetEntityRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public List<AmountTweetsHourDto> get() {

        return tweetRepository.reportAmountTweetsHour();
    }
}
