package com.sheoanna.hexagonal_food_order.domain.dto;

public record FoodOrder(String orderId,
                        String customerName,
                        String restaurantName,
                        String item,
                        String status) {
}
