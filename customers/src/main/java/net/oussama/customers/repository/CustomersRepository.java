package net.oussama.customers.repository;

import net.oussama.customers.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
    @Query("select phone from Customers phone where phone.phone like :phone")
    Optional<Customers> findBynumberphone(@Param("phone") String phone);
}
