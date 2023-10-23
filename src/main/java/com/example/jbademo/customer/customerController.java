package com.example.jbademo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class customerController {

    private final CustomerService customerService;

    @Autowired
    public customerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomer();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
    }

    @PutMapping
    public Customer updateCustomer(Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @PutMapping("/name")
    public Customer updateCustomerById(@RequestBody Customer customer){
        return customerService.updateCustomerName(customer);
    }
}
