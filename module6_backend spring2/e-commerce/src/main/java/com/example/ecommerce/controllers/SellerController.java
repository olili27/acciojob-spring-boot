package com.example.ecommerce.controllers;

import com.example.ecommerce.dtos.requests.SellerRequestDto;
import com.example.ecommerce.dtos.responses.SellerResponseDto;
import com.example.ecommerce.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @PostMapping("/add")
    public ResponseEntity<?> addSeller(@RequestBody SellerRequestDto sellerRequestDto) {

        try {
            return  new ResponseEntity<>(sellerService.addSeller(sellerRequestDto), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
