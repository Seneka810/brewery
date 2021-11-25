package com.kord.brewery.service;

import com.kord.brewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerTd);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
