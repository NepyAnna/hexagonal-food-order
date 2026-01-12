package com.sheoanna.hexagonal_food_order.adapter.output.repositories;

import com.sheoanna.hexagonal_food_order.adapter.output.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, String> {
}
