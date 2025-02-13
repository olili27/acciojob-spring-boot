package com.example.ecommerce.services;

import com.example.ecommerce.dtos.requests.SellerRequestDto;
import com.example.ecommerce.dtos.responses.SellerResponseDto;
import com.example.ecommerce.exceptions.EmailAlreadyPresentException;
import com.example.ecommerce.models.Seller;
import com.example.ecommerce.repositories.SellerRepository;
import com.example.ecommerce.transformers.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    public SellerResponseDto addSeller(SellerRequestDto sellerRequestDto) throws Exception {

        if (sellerRepository.findByEmail(sellerRequestDto.getEmail()) != null) throw new EmailAlreadyPresentException("Email already exits");

        Seller seller = SellerTransformer.sellerRequestDtoToSeller(sellerRequestDto);
        Seller savedseller = sellerRepository.save(seller);

        return SellerTransformer.sellerToSellerResponseDto(savedseller);
    }
}
