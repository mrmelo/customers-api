package com.bcobogota.customers.controller;

import com.bcobogota.customers.dto.CustomerRequestDTO;
import com.bcobogota.customers.dto.CustomerResponseDTO;
import com.bcobogota.customers.mapper.CustomerMapper;
import com.bcobogota.customers.model.Customer;
import com.bcobogota.customers.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public CustomerResponseDTO createCustomer(@RequestBody CustomerRequestDTO request) {
        Customer customer = CustomerMapper.toEntity(request);
        Customer saved = customerService.createCustomer(customer);
        return CustomerMapper.toDTO(saved);
    }

    @GetMapping
    public List<CustomerResponseDTO> getAllCustomers() {
        return customerService.getAllCustomers()
                .stream()
                .map(CustomerMapper::toDTO)
                .toList();
    }
}