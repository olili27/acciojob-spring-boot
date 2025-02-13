package com.example.ecommerce.dtos.requests;

import com.example.ecommerce.enums.ProductCategory;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {

    int sellerId;
    String productName;

    int price;

    int quantity;

    @Enumerated(EnumType.STRING)
    ProductCategory productCategory;
}
