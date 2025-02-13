package com.example.spring2.mock.controllers;

import com.example.spring2.mock.services.FoodOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/foodOrder")
@RequiredArgsConstructor
public class FoodOrderController {

    private final FoodOrderService foodOrderService;

    @GetMapping("/get-total-price-on-giveDate-for-a-train")
    public ResponseEntity<Integer> getTotalPriceOfOrdersOnGivenDateOnTrain(@RequestParam LocalDate date, @RequestParam Integer trainId) {
        return ResponseEntity.ok().body(foodOrderService.getTotalPriceOfOrdersOnGivenDateOnTrain(date, trainId));
    }

}
