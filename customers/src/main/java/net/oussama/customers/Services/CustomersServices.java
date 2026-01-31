package net.oussama.customers.Services;

import net.oussama.customers.Dtos.CustomersDto;
import net.oussama.customers.entity.Customers;

public interface CustomersServices {
    void createCustomer(CustomersDto customerdto);
}
