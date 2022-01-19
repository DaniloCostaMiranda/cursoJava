package com.curso.JavaUdemyNelio.services;

import com.curso.JavaUdemyNelio.entities.Product;
import com.curso.JavaUdemyNelio.entities.User;
import com.curso.JavaUdemyNelio.repositories.ProductRepository;
import com.curso.JavaUdemyNelio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}


