package com.fabio2g.snaporder.repositories;

import com.fabio2g.snaporder.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
