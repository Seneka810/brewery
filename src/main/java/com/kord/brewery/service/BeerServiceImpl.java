package com.kord.brewery.service;

import com.kord.brewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerTd) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Obolon")
                .beerStyle("Dark")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }
}
