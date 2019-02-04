package br.com.evaluation.twitterreportapi.infra.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends MongoRepository<Tweet, Long> {

}
