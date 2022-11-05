package com.myfood.repo;

import com.myfood.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Customer, Long> {
}
