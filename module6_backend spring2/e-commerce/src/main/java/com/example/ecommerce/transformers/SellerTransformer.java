package com.example.ecommerce.transformers;

import com.example.ecommerce.dtos.requests.SellerRequestDto;
import com.example.ecommerce.dtos.responses.SellerResponseDto;
import com.example.ecommerce.models.Seller;

public class SellerTransformer {

    public static Seller sellerRequestDtoToSeller(SellerRequestDto sellerRequestDto) {
        return Seller.builder()
                .name(sellerRequestDto.getName())
                .email(sellerRequestDto.getEmail())
                .age(sellerRequestDto.getAge())
                .mobileNo(sellerRequestDto.getMobileNo())
                .build();
    }

    public static SellerResponseDto sellerToSellerResponseDto(Seller seller) {
        return SellerResponseDto.builder()
                .name(seller.getName())
                .age(seller.getAge())
                .build();
    }
}
