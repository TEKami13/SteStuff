package com.example.jbademo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepo.findById(id).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public void deleteCustomerById(Long id) {
        customerRepo.deleteById(id);
    }

    public Customer updateCustomerName(Customer customer) {
        Customer customerToUpdate = customerRepo.findById(customer.getCustomerId()).orElse(null);

        if (customerToUpdate != null) {
            customerToUpdate.setCustomerName(customer.getCustomerName());
        }
        return null;
    }

    public Customer updateCustomerMail(Customer customer) {
        Customer customerToUpdate = customerRepo.findById(customer.getCustomerId()).orElse(null);

        if (customerToUpdate != null) {
            customerToUpdate.setCustomerMail(customer.getCustomerMail());
        }
        return null;
    }

    public Customer updateCustomerPhone(Customer customer) {
        Customer customerToUpdate = customerRepo.findById(customer.getCustomerId()).orElse(null);

        if (customerToUpdate != null) {
            customerToUpdate.setCustomerPhone(customer.getCustomerPhone());
        }
        return null;
    }
}
