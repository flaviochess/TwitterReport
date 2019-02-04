package br.com.evaluation.twitterreportapi.domain.usecases;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.stereotype.Component;
import br.com.evaluation.twitterreportapi.infra.repositories.TweetRepository;

@Component
public class SaveAllLastTweets {

    private final TweetRepository tweetRepository;

    private final SearchLastTweets searchLastTweets;

    @Autowired
    public SaveAllLastTweets(TweetRepository tweetRepository, SearchLastTweets searchLastTweets) {
        this.tweetRepository = tweetRepository;
        this.searchLastTweets = searchLastTweets;
    }

    public void execute() {

        List<Tweet> tweets = searchLastTweets.execute();

        tweetRepository.save(tweets);
    }
}
