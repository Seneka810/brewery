package com.kord.brewery.web.mappers;

import com.kord.brewery.domain.Customer;
import com.kord.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoTOCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);
}
