package com.kiryushinsa.spring_crud.rest;

import com.kiryushinsa.spring_crud.entity.Customer;
import com.kiryushinsa.spring_crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {

        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        Customer theCustomer = customerService.getCustomer(customerId);

        if (theCustomer == null) {
            throw new CustomerNotFoundException("Customer not found - " + customerId);
        }
        return theCustomer;
    }

    @PostMapping("/customers")
    public Customer addCustomer (@RequestBody Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {
        customerService.saveCustomer(theCustomer);

        return theCustomer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {

        if ( customerService.getCustomer(customerId) == null) {
            throw new CustomerNotFoundException("Customer not found - " + customerId);
        }

        customerService.deleteCustomer(customerId);

        return "Deleted Customer id - " + customerId;
    }

}
