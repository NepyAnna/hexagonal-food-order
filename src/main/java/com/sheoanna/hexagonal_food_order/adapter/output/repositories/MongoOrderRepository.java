package com.sheoanna.hexagonal_food_order.adapter.output.repositories;

import com.sheoanna.hexagonal_food_order.domain.dto.FoodOrder;
import com.sheoanna.hexagonal_food_order.domain.port.output.OrderRepositoryPort;

public class MongoOrderRepository implements OrderRepositoryPort {
    @Override
    public void saveOrder(FoodOrder order) {

    }

    @Override
    public String findById(String orderId) {
        return "";
    }
}
