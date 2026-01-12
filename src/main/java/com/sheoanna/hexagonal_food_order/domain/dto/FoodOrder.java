package com.sheoanna.hexagonal_food_order.domain.dto;

import lombok.Data;

@Data
public class FoodOrder {
    private String orderId;
    private String customerName;
    private String restaurantName;
    private String item;
    private String status;
}
