package org.jspiders.customercontrollerjpa.repository;

import org.jspiders.customercontrollerjpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<Customer,Integer> {
}
