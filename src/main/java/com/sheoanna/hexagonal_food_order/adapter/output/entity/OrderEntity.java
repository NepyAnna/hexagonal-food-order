package com.sheoanna.hexagonal_food_order.adapter.output.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Data
public class OrderEntity {
    @Id
    private String orderId;
    private String customerName;
    private String restaurantName;
    private String item;
    private String status;
}
