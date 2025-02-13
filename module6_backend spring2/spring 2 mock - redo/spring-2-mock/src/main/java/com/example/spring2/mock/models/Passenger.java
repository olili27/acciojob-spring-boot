package com.example.spring2.mock.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ticketId;

    @ManyToOne
    @JoinColumn
    Train train;
    LocalDate date ;
    Integer age;
    String gender;

    @OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL)
    List<FoodOrder> foodOrders = new ArrayList<>();
}
