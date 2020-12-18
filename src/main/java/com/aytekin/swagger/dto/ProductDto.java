package com.aytekin.swagger.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDto {

    public ProductDto(Long id, String title, BigDecimal price, String imagePath, String owner) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.imagePath = imagePath;
        this.owner = owner;
    }

    private Long id;
    private String title;
    private BigDecimal price;
    private String imagePath;
    private String owner;

}
