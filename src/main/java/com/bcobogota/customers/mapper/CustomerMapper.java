package com.bcobogota.customers.mapper;

import com.bcobogota.customers.dto.CustomerRequestDTO;
import com.bcobogota.customers.dto.CustomerResponseDTO;
import com.bcobogota.customers.model.Customer;

public class CustomerMapper {

    public static Customer toEntity(CustomerRequestDTO dto) {
        return new Customer(
                null,
                dto.getName(),
                dto.getEmail()
        );
    }

    public static CustomerResponseDTO toDTO(Customer customer) {
        CustomerResponseDTO dto = new CustomerResponseDTO();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setEmail(customer.getEmail());
        return dto;
    }
}