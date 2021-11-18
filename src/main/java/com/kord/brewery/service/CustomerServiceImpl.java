package com.kord.brewery.service;

import com.kord.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Stas")
                .build();
    }
}
