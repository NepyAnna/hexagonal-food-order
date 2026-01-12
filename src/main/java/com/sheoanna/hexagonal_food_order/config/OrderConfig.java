package com.sheoanna.hexagonal_food_order.config;

import com.sheoanna.hexagonal_food_order.domain.port.output.OrderRepositoryPort;
import com.sheoanna.hexagonal_food_order.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {
    @Bean
    public OrderService orderService(OrderRepositoryPort repository) {
        return new OrderService(repository);
    }
}
