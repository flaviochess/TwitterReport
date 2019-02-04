package br.com.evaluation.twitterreportapi.domain.entities;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.social.twitter.api.HashTagEntity;

@Getter
@Setter
public class EntitiesTweet {

    private List<HashTagEntity> tags;

}
