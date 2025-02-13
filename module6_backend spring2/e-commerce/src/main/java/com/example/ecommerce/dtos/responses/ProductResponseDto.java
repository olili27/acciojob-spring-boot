package com.example.ecommerce.dtos.responses;

import com.example.ecommerce.enums.ProductStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDto {

    String productName;

    String sellerName;

    int quantity;

    ProductStatus productStatus;
}
