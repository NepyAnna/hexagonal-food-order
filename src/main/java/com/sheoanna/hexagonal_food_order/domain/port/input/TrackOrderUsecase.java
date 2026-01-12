package com.sheoanna.hexagonal_food_order.domain.port.input;

import com.sheoanna.hexagonal_food_order.domain.dto.FoodOrder;

public interface TrackOrderUsecase {
    String trackOrder(String orderId);
}
