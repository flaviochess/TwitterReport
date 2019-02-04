package br.com.evaluation.twitterreportapi.infra.repositories;

import br.com.evaluation.twitterreportapi.infra.dtos.AmountHashtagLanguageDto;
import br.com.evaluation.twitterreportapi.infra.dtos.AmountTweetsHourDto;
import br.com.evaluation.twitterreportapi.infra.dtos.UserFollowersDto;
import java.util.List;

public interface TweetEntityRepositoryCustomized {

    List<UserFollowersDto> searchUsersWithMoreFollowers(int amount);

    List<AmountTweetsHourDto> reportAmountTweetsHour();

    List<AmountHashtagLanguageDto> reportAmountHashtagByLanguage();

}
