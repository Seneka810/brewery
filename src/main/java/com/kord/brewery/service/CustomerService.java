package com.kord.brewery.service;

import com.kord.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerByID(UUID customerId);
}
