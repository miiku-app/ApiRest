package com.example.restapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private int id;
    private String imagePath;
    private String title;
    private String description;

    public ProductDTO() {
        // Constructor vacío para deserialización
    }

    public ProductDTO(int id, String imagePath, String title, String description) {
        this.id = id;
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }
}
