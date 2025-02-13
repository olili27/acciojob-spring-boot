package com.example.japbasics;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    private Date expiry;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn
    private User user;
}
