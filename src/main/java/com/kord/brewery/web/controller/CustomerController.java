package com.kord.brewery.web.controller;

import com.kord.brewery.service.CustomerService;
import com.kord.brewery.web.model.BeerDto;
import com.kord.brewery.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerByID(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@Valid @RequestBody CustomerDto customerDto) {
        CustomerDto newCustomer = customerService.saveCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + newCustomer.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable UUID customerId,
                                                      @Valid @RequestBody CustomerDto customerDto) {
        customerService.updateCustomer(customerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID customerId) {
        customerService.deleteCustomer(customerId);
    }
}
