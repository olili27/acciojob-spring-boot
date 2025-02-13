package com.example.japbasics;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String name;

    private int age;

    private String mobileNumber;

    @OneToOne(mappedBy = "user")
    private Card card;
}
