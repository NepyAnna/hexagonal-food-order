package com.sheoanna.hexagonal_food_order.adapter.output;

import com.sheoanna.hexagonal_food_order.adapter.output.entity.OrderEntity;
import com.sheoanna.hexagonal_food_order.adapter.output.repositories.SpringDataOrderRepository;
import com.sheoanna.hexagonal_food_order.domain.dto.FoodOrder;
import com.sheoanna.hexagonal_food_order.domain.port.output.OrderRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JpaOrderRepository implements OrderRepositoryPort {
    @Autowired
    private SpringDataOrderRepository repository;

    @Override
    public void saveOrder(FoodOrder order) {
        repository.save(mapToEntity(order));
    }

    @Override
    public String findById(String orderId) {
        OrderEntity entity = repository.findById(orderId).orElseThrow();
        return mapToDomain(entity).getStatus();
    }

    private OrderEntity mapToEntity(FoodOrder order) {
        OrderEntity entity = new OrderEntity();
        entity.setOrderId(order.getOrderId());
        entity.setCustomerName(order.getCustomerName());
        entity.setRestaurantName(order.getRestaurantName());
        entity.setItem(order.getItem());
        entity.setStatus(order.getStatus());
        return entity;
    }

    private FoodOrder mapToDomain(OrderEntity entity) {
        FoodOrder order = new FoodOrder();
        order.setOrderId(entity.getOrderId());
        order.setCustomerName(entity.getCustomerName());
        order.setRestaurantName(entity.getRestaurantName());
        order.setItem(entity.getItem());
        order.setStatus(entity.getStatus());
        return order;
    }
}
