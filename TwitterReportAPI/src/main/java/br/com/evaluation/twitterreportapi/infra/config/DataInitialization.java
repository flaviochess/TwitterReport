package br.com.evaluation.twitterreportapi.infra.config;

import br.com.evaluation.twitterreportapi.domain.usecases.SaveAllLastTweets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.com.evaluation.twitterreportapi.infra.repositories.TweetRepository;

@Component
public class DataInitialization {

    private final TweetRepository tweetRepository;

    private final SaveAllLastTweets saveAllLastTweets;

    @Autowired
    public DataInitialization(TweetRepository tweetRepository, SaveAllLastTweets saveAllLastTweets) {
        this.tweetRepository = tweetRepository;
        this.saveAllLastTweets = saveAllLastTweets;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {

        tweetRepository.deleteAll();

        saveAllLastTweets.execute();
    }

}
