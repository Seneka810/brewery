package com.kord.brewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
class BeerDtoKebabTest extends BaseTest{
    @Autowired
    ObjectMapper mapper;

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String json = mapper.writeValueAsString(beerDto);

        System.out.println(json);
    }
}
