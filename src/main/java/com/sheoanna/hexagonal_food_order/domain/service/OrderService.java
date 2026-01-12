package com.sheoanna.hexagonal_food_order.domain.service;

import com.sheoanna.hexagonal_food_order.domain.dto.FoodOrder;
import com.sheoanna.hexagonal_food_order.domain.port.input.PlaceOrderUsecase;
import com.sheoanna.hexagonal_food_order.domain.port.input.TrackOrderUsecase;

public class OrderService implements PlaceOrderUsecase, TrackOrderUsecase {
    @Override
    public void placeOrder(FoodOrder order) {

    }

    @Override
    public String trackOrder(String orderId) {
        return "";
    }
}
