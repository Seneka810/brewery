package com.kord.brewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper mapper;

    @Test
    void testSerializedDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = mapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2021-12-10T16:34:48+0200\",\"lastUpdatedDate\":\"2021-12-10T16:34:48.071294+02:00\",\"myLocalDate\":\"20211210\",\"beerId\":\"e034e924-57eb-48ce-888a-29fb7eb08dcc\"}\n";

        BeerDto beerDto = mapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}