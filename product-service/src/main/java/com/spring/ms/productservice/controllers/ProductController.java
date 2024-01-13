package com.spring.ms.productservice.controllers;

import com.spring.ms.productservice.dtos.ProductRequest;
import com.spring.ms.productservice.services.ProductService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(ProductRequest request){
         service.saveProduct(request);
         return ResponseEntity.ok("saved");
    }
    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok("working");
    }
}
