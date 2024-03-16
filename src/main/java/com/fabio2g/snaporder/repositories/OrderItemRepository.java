package com.fabio2g.snaporder.repositories;

import com.fabio2g.snaporder.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {
}
