package com.example.spring2.mock.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer trainId;
    String source;
    String Destination;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    List<FoodOrder> foodOrders = new ArrayList<>();

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    List<Passenger> passengers = new ArrayList<>();
}
