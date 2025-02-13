package com.example.ecommerce.services;

import com.example.ecommerce.dtos.requests.ProductRequestDto;
import com.example.ecommerce.dtos.responses.ProductResponseDto;
import com.example.ecommerce.exceptions.SellerNotExistException;
import com.example.ecommerce.models.Product;
import com.example.ecommerce.models.Seller;
import com.example.ecommerce.repositories.SellerRepository;
import com.example.ecommerce.transformers.ProductTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    SellerRepository sellerRepository;

       public ProductResponseDto addProduct(ProductRequestDto productRequestDto) throws Exception{

        Seller seller;

        try{
            seller = sellerRepository.findById(productRequestDto.getSellerId()).get();
        } catch (Exception e) {
            throw new SellerNotExistException("Seller does not exist");
        }

        Product product = ProductTransformer.productRequestDtoToProduct(productRequestDto);
        product.setSeller(seller);

        seller.getProducts().add(product);

        sellerRepository.save(seller);

        return ProductTransformer.productToProductResponseDto(product);
    }
}
