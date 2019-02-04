package br.com.evaluation.twitterreportapi.domain.usecases;

import br.com.evaluation.twitterreportapi.domain.entities.TweetEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.evaluation.twitterreportapi.infra.repositories.TweetEntityRepository;

@Component
public class SaveAllLastTweets {

    private final TweetEntityRepository tweetRepository;

    private final SearchLastTweets searchLastTweets;

    @Autowired
    public SaveAllLastTweets(TweetEntityRepository tweetRepository, SearchLastTweets searchLastTweets) {
        this.tweetRepository = tweetRepository;
        this.searchLastTweets = searchLastTweets;
    }

    public void execute() {

        List<TweetEntity> tweets = searchLastTweets.execute();

        tweetRepository.save(tweets);
    }
}
