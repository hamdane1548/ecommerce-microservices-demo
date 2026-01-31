package net.oussama.customers.Services.Impl;

import lombok.AllArgsConstructor;
import net.oussama.customers.Services.CustomersServices;
import net.oussama.customers.entity.Customers;
import net.oussama.customers.repository.CustomersRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomersImpl implements CustomersServices {
    private CustomersRepository repository;
    @Override
    public void createCustomer(Customers customer) {

    }
}
