package br.com.evaluation.twitterreportapi.domain.usecases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Component;

@Component
public class SearchLastTweets {

    private final List<String> hashtags
            = Arrays.asList("#openbanking", "#apifirst", "#devops", "#cloudfirst",
                    "#microservices", "#apigateway", "#oauth", "#swagger", "#raml", "#openapis");

    private final Twitter twitter;

    private final ModelMapper modelMapper;

    @Autowired
    public SearchLastTweets(Twitter twitter, ModelMapper modelMapper) {
        this.twitter = twitter;
        this.modelMapper = modelMapper;
    }

    public List<Tweet> execute() {

        List<Tweet> tweets = new ArrayList();

        hashtags.stream()
                .forEach(hashtag
                        -> tweets.addAll(twitter.searchOperations().search(hashtag).getTweets()));

        return tweets;
    }

}

//        System.out.println("Tweets: " + tweets.size());
//        System.out.println("User: " + tweets.get(0).getFromUser());
//        System.out.println("Language code: " + tweets.get(0).getLanguageCode());
//        System.out.println("create at: " + tweets.get(0).getCreatedAt());
//        System.out.println("dados extras: " + tweets.get(0).getExtraData());
//        System.out.println("user language: " + tweets.get(0).getUser().getLanguage());
//        System.out.println("followers: " + tweets.get(0).getUser().getFollowersCount());
//        System.out.println("location: " + tweets.get(0).getUser().getLocation());
