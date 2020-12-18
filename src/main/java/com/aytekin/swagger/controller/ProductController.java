package com.aytekin.swagger.controller;

import com.aytekin.swagger.dto.ProductDto;
import com.aytekin.swagger.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("findAll")
    public List<ProductDto> findAll() {
        return productService.getProducts();
    }

    @GetMapping("get")
    public ProductDto get(Long id) throws ClassNotFoundException {
        return productService.get(id);
    }

    @GetMapping("getByTitle")
    public ProductDto getByTitle(String title) {
        return productService.getByTitle(title);
    }

    @PostMapping
    public Long save(@RequestBody ProductDto product) throws StackOverflowError, IllegalArgumentException {
        return productService.save(product);
    }

    @DeleteMapping
    public boolean delete(Long id) {
        return productService.delete(id);
    }

}
