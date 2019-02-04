package br.com.evaluation.twitterreportapi.infra.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
public class TwitterConfig {

    @Bean
    public Twitter twitter(final @Value("${spring.social.twitter.app-id}") String appId,
            final @Value("${spring.social.twitter.app-secret}") String appSecret) {

        return new TwitterTemplate(appId, appSecret);
    }
}
