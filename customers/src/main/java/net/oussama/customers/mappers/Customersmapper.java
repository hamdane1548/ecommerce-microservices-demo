package net.oussama.customers.mappers;

import net.oussama.customers.Dtos.CustomersDto;
import net.oussama.customers.entity.Customers;
import org.springframework.beans.BeanUtils;

public class Customersmapper {
    private static Customers toCustomers(CustomersDto customersDto){
         Customers customers = new Customers();
         BeanUtils.copyProperties(customersDto, customers);
         return customers;
    }
    public static CustomersDto toCustomersDto(Customers customers) {
        CustomersDto customersDto = new CustomersDto();
        BeanUtils.copyProperties(customers, customersDto);
        return customersDto;
    }
}
