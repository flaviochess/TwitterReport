package br.com.evaluation.twitterreportapi.domain.usecases;

import br.com.evaluation.twitterreportapi.infra.dtos.AmountHashtagLanguageDto;
import br.com.evaluation.twitterreportapi.infra.repositories.TweetEntityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportAmountHashtagByLanguage {

    private final TweetEntityRepository tweetRepository;

    @Autowired
    public ReportAmountHashtagByLanguage(TweetEntityRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public List<AmountHashtagLanguageDto> get() {

        return tweetRepository.reportAmountHashtagByLanguage();
    }
}
