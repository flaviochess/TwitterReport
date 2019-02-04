package br.com.evaluation.twitterreportapi.domain.usecases;

import br.com.evaluation.twitterreportapi.infra.dtos.UserFollowersDto;
import br.com.evaluation.twitterreportapi.infra.repositories.TweetEntityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchUsersWithMoreFollowers {

    private final TweetEntityRepository tweetRepository;

    @Autowired
    public SearchUsersWithMoreFollowers(TweetEntityRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public List<UserFollowersDto> search(int amount) {

        return tweetRepository.searchUsersWithMoreFollowers(amount);

    }

}
