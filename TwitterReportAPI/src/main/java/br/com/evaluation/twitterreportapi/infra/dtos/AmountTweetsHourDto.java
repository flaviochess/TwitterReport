package br.com.evaluation.twitterreportapi.infra.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AmountTweetsHourDto {

    private int year;

    private int month;

    private int day;

    private int hour;

    private long count;

}
