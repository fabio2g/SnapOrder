package com.fabio2g.snaporder.repositories;

import com.fabio2g.snaporder.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
