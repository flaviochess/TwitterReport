package br.com.evaluation.twitterreportapi.infra.repositories;

import br.com.evaluation.twitterreportapi.domain.entities.TweetEntity;
import br.com.evaluation.twitterreportapi.infra.dtos.AmountHashtagLanguageDto;
import br.com.evaluation.twitterreportapi.infra.dtos.AmountTweetsHourDto;
import br.com.evaluation.twitterreportapi.infra.dtos.UserFollowersDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.limit;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Repository;

@Repository
public class TweetEntityRepositoryImpl implements TweetEntityRepositoryCustomized {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public TweetEntityRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<UserFollowersDto> searchUsersWithMoreFollowers(int amount) {

        Aggregation aggregation = Aggregation.newAggregation(
                group("fromUser", "user.followersCount"),
                sort(Sort.Direction.DESC, "_id.followersCount"),
                limit(amount)
        );

        AggregationResults<UserFollowersDto> groupResults = mongoTemplate.aggregate(aggregation, TweetEntity.class, UserFollowersDto.class);

        return groupResults.getMappedResults();
    }

    @Override
    public List<AmountTweetsHourDto> reportAmountTweetsHour() {

        Aggregation aggregation = Aggregation.newAggregation(
                project()
                        .and("createdAt").extractYear().as("year")
                        .and("createdAt").extractMonth().as("month")
                        .and("createdAt").extractDayOfMonth().as("day")
                        .and("createdAt").extractHour().as("hour"),
                group("year", "month", "day", "hour")
                        .count().as("count"),
                sort(Sort.Direction.DESC, "_id")
        );

        AggregationResults<AmountTweetsHourDto> groupResults = mongoTemplate.aggregate(aggregation, TweetEntity.class, AmountTweetsHourDto.class);

        return groupResults.getMappedResults();
    }

    @Override
    public List<AmountHashtagLanguageDto> reportAmountHashtagByLanguage() {

        Aggregation aggregation = Aggregation.newAggregation(
                group("mainHashtag", "user.language")
                        .count().as("count"),
                project("count")
                        .and("_id.mainHashtag").as("hashtag"),
                sort(Sort.Direction.ASC, "hashtag")
        );

        AggregationResults<AmountHashtagLanguageDto> groupResults = mongoTemplate.aggregate(aggregation, TweetEntity.class, AmountHashtagLanguageDto.class);

        return groupResults.getMappedResults();
    }

}
