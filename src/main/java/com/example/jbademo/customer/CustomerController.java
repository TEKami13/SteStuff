package com.example.jbademo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
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
    public Customer updateCustomerNameById(@RequestBody Customer customer){
        return customerService.updateCustomerName(customer);
    }

    @PutMapping("/phone")
    public Customer updateCustomerPhoneById(@RequestBody Customer customer){
        return customerService.updateCustomerPhone(customer);
    }

    @PutMapping("/mail")
    public Customer updateCustomerMailById(@RequestBody Customer customer){
        return customerService.updateCustomerMail(customer);
    }
}
