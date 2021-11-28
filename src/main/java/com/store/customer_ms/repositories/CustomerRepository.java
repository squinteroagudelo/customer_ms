package com.store.customer_ms.repositories;

import com.store.customer_ms.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findCustomerByName(String name);
    List<Customer> findCustomerByLastname(String lastname);
}
