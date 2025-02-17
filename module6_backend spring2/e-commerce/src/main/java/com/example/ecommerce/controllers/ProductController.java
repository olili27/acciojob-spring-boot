package com.example.ecommerce.controllers;

import com.example.ecommerce.dtos.requests.ProductRequestDto;
import com.example.ecommerce.dtos.responses.ProductResponseDto;
import com.example.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<?> addProduct(ProductRequestDto productRequestDto) {
        try {
            ProductResponseDto productResponseDto = productService.addProduct(productRequestDto);

            return new ResponseEntity<>(productResponseDto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
