package org.jspiders.customerapijpa.Repository;

import org.jspiders.customerapijpa.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    List<Customer> findByCustomerName(String name);

    Customer findByCustomerEmail(String email);

    List<Customer> findByCustomerAgeGreaterThan(int age);

    List<Customer> findByTotalPurchaseLessThan(double amt);

    List<Customer> findByCustomerNameAndCustomerAge(String name, int age);

    List<Customer> findByCustomerAgeBetween(int age1,int age2);



//    /////////////////////////////Writing JPQL/////////////////////////////////
    @Query("select c from Customer c where c.customerName=:name")
    List<Customer> viewCustomerByName(@Param("name") String name);

    @Query("select c.customerName from Customer c where c.customerAge<:age and c.totalPurchase>=:amt")
    List<String> viewCustomerName(@Param("age") int age,@Param("amt") double amt);

    @Query("select c.customerName from Customer c where c.customerName like %:name%")
    List<String> viewCustomerNameContains(@Param("name") String name);

    @Query("select c.customerName from Customer c where c.customerName like :name%")
    List<String> viewNameeStartWith(@Param("name") String name);

    @Query("select c.customerName from Customer c where c.customerName like %:name")
    List<String> viewNameEndtWith(@Param("name") String name);

    //using SQL
//    @Query(name = "select * from customer_sales",nativeQuery = true)
//    List<Customer> displayAllCustomers();
}

