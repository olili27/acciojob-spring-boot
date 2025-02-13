package com.example.spring2.mock.repositories;

import com.example.spring2.mock.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
