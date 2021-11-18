package com.kord.brewery.web.controller;

import com.kord.brewery.service.BeerService;
import com.kord.brewery.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerTd}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerTd) {
        return new ResponseEntity<>(beerService.getBeerById(beerTd), HttpStatus.OK);
    }
}
