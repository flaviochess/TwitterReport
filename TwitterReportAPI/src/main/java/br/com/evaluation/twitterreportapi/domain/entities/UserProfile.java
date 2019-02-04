package br.com.evaluation.twitterreportapi.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfile {

    private String name;

    private String location;

    private String language;

    private int followersCount;

}
