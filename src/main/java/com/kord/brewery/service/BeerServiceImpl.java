package com.kord.brewery.service;

import com.kord.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
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

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
