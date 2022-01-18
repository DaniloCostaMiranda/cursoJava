package com.curso.JavaUdemyNelio.repositories;

import com.curso.JavaUdemyNelio.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
