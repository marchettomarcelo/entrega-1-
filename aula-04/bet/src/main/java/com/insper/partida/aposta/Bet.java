package com.insper.partida.aposta;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("")
public class Bet {

    @Id
    private Integer id;
    private BetStatus status;
    private BetResult result;

    private String gameIdentifier;

}
