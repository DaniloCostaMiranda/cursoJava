package com.curso.JavaUdemyNelio.repositories;

import com.curso.JavaUdemyNelio.entities.OrderItem;
import com.curso.JavaUdemyNelio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
