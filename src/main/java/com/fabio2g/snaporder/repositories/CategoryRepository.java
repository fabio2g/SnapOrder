package com.fabio2g.snaporder.repositories;

import com.fabio2g.snaporder.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
