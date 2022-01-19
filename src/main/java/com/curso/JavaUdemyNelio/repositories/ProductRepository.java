package com.curso.JavaUdemyNelio.repositories;

import com.curso.JavaUdemyNelio.entities.Category;
import com.curso.JavaUdemyNelio.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
