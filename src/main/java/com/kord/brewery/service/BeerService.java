package com.kord.brewery.service;

import com.kord.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerTd);
}
