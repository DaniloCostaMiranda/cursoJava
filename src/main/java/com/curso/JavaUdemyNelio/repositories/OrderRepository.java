package com.curso.JavaUdemyNelio.repositories;

import com.curso.JavaUdemyNelio.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
