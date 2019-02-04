package br.com.evaluation.twitterreportapi.domain.entities;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@EqualsAndHashCode(of = "fromUser")
@Document
public class TweetEntity {

    private long id;

    private String text;

    private Date createdAt;

    private String fromUser;

    private EntitiesTweet entities;

    private UserProfile user;

    private String mainHashtag;
}
