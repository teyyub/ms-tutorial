package com.spring.ms.productservice.services;

import com.spring.ms.productservice.dtos.ProductRequest;
import com.spring.ms.productservice.dtos.ProductResponse;
import com.spring.ms.productservice.entities.Product;
import com.spring.ms.productservice.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductResponse saveProduct(ProductRequest request){
         Product product = new Product();
         product.setName(request.getName());
         product.setDescription(request.getDescription());
         product.setPrice(request.getPrice());
         repository.save(product);
         log.info("Product {} is save",product.getId());
         return null;
     }
}
