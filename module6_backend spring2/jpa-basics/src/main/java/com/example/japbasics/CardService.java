package com.example.japbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public String addCard(Card card) {
        cardRepository.save(card);

        return "card added";
    }
}
