package com.sheoanna.hexagonal_food_order.adapter.input.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sheoanna.hexagonal_food_order.domain.dto.FoodOrder;
import com.sheoanna.hexagonal_food_order.domain.port.input.PlaceOrderUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderKafkaConsumer {
    @Autowired
    private PlaceOrderUsecase placeOrderUseCase;
    //@KafkaListener(topics = "food-order-topic", groupId = "order-group")
    public void consume(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        FoodOrder order = mapper.readValue(message, FoodOrder.class);
        placeOrderUseCase.placeOrder(order);
        System.out.println("Order placed via Kafka");
    }
}
