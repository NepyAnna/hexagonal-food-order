package com.sheoanna.hexagonal_food_order.domain.port.output;

import com.sheoanna.hexagonal_food_order.domain.dto.FoodOrder;

public interface OrderRepositoryPort {
    void saveOrder(FoodOrder order);
    String findById(String orderId);
}
