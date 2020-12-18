package com.aytekin.swagger.service;

import com.aytekin.swagger.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {

    List<ProductDto> products = new ArrayList<ProductDto>();
    ProductDto product;

    public List<ProductDto> getProducts(){
        return products;
    }

    public ProductDto get(Long id) throws ClassNotFoundException{
        return product;
    }

    public ProductDto getByTitle(String title) {
        return product;
    }

    public Long save(ProductDto product) throws StackOverflowError,IllegalArgumentException{
        return (long) 1;
    }

    public boolean delete(Long id){
        return true;
    }
}
