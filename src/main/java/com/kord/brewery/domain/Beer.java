package com.kord.brewery.domain;

import com.kord.brewery.web.model.BeerStyle;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;

    private Timestamp createDate;
    private Timestamp lastUpdateDate;
}
