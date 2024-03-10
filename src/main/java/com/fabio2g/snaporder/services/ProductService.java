package com.fabio2g.snaporder.services;

import com.fabio2g.snaporder.entities.Product;
import com.fabio2g.snaporder.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> list = repository.findById(id);
        return list.get();
    }
}
