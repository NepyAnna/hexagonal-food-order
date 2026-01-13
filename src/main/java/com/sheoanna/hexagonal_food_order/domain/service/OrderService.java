package com.sheoanna.hexagonal_food_order.domain.service;

import com.sheoanna.hexagonal_food_order.domain.dto.FoodOrder;
import com.sheoanna.hexagonal_food_order.domain.port.input.PlaceOrderUsecase;
import com.sheoanna.hexagonal_food_order.domain.port.input.TrackOrderUsecase;
import com.sheoanna.hexagonal_food_order.domain.port.output.OrderRepositoryPort;

public class OrderService implements PlaceOrderUsecase, TrackOrderUsecase {
    private final OrderRepositoryPort orderRepositoryPort;

    public OrderService(OrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public void placeOrder(FoodOrder order) {
        order.setStatus("Order placed");
        System.out.println("--CORE EXECUTED WITH INPUT PORT--");
        orderRepositoryPort.saveOrder(order);
    }

    @Override
    public String trackOrder(String orderId) {
        System.out.println("--CORE EXECUTED WITH INPUT PORT--");
        return orderRepositoryPort.findById(orderId);
    }
}
