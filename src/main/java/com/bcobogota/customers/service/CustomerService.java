package com.bcobogota.customers.service;

import com.bcobogota.customers.model.Customer;
import java.util.List;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomers();
}