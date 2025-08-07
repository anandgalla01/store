package com.store.microservices.product.controller;

import com.store.microservices.product.dto.ProductRequest;
import com.store.microservices.product.dto.ProductResponse;
import com.store.microservices.product.model.Product;
import com.store.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse CreateProduct(@RequestBody ProductRequest productRequest) {
        return productService.CreateProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
