package com.example.ecommerce.transformers;

import com.example.ecommerce.dtos.requests.ProductRequestDto;
import com.example.ecommerce.dtos.responses.ProductResponseDto;
import com.example.ecommerce.enums.ProductStatus;
import com.example.ecommerce.models.Product;

public class ProductTransformer {

    public static Product productRequestDtoToProduct(ProductRequestDto productRequestDto) {
        return Product.builder()
                .name(productRequestDto.getProductName())
                .price(productRequestDto.getPrice())
                .productCategory(productRequestDto.getProductCategory())
                .quantity(productRequestDto.getQuantity())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }

    public static ProductResponseDto productToProductResponseDto(Product product) {
        return ProductResponseDto.builder()
                .productName(product.getName())
                .productStatus(product.getProductStatus())
                .sellerName(product.getSeller().getName())
                .quantity(product.getQuantity())
                .build();
    }
}
