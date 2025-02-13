package com.example.spring2.mock.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private int userId;
    private int amount;
    @Enumerated(EnumType.STRING)
    private Status status;
    private int amountDeducted;

    @ManyToOne
    @JoinColumn
    private User user;
}
