package br.com.evaluation.twitterreportapi.infra.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AmountHashtagLanguageDto {

    private String hashtag;

    private String language;

    private long count;
}
