package net.oussama.customers.Services.Impl;

import lombok.AllArgsConstructor;
import net.oussama.customers.Dtos.CustomersDto;
import net.oussama.customers.Exception.CustomerAleradyExists;
import net.oussama.customers.Services.CustomersServices;
import net.oussama.customers.entity.Customers;
import net.oussama.customers.mappers.Customersmapper;
import net.oussama.customers.repository.CustomersRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomersImpl implements CustomersServices {
    private CustomersRepository repository;
    @Override
    public void createCustomer(CustomersDto customer) {
       Optional<Customers> customers = repository.findBynumberphone(customer.getPhone());
       if (customers.isPresent()) {
           throw new CustomerAleradyExists("Customer already exists"+customer.getPhone());
       }
       Customers customerEntity = Customersmapper.toCustomers(customer);
       repository.save(customerEntity);
    }
}
