package com.example.spring2.mock.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer foodOrderId;
    @ManyToOne
    @JoinColumn
    Passenger passenger;

    @ManyToOne
    @JoinColumn
    Train train;
    Integer price;
}
