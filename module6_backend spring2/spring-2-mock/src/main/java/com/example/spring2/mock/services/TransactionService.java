package com.example.spring2.mock.services;

import com.example.spring2.mock.models.Transaction;
import com.example.spring2.mock.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public String addTransaction(Transaction transaction) {
        Transaction saved = transactionRepository.save(transaction);
        return saved.getStatus().toString();
    }
}
