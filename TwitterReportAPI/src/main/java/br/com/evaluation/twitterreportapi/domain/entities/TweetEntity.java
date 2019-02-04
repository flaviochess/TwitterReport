package br.com.evaluation.twitterreportapi.domain.entities;

import java.util.Date;
import org.springframework.social.twitter.api.Tweet;

/**
 *
 * @author Flavio Andrade <onsave.com.br>
 */
public class TweetEntity extends Tweet {

    public TweetEntity(long id, String idStr, String text, Date createdAt, String fromUser, String profileImageUrl, Long toUserId, long fromUserId, String languageCode, String source) {
        super(id, idStr, text, createdAt, fromUser, profileImageUrl, toUserId, fromUserId, languageCode, source);
    }

}
