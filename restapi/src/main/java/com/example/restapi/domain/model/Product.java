package com.example.restapi.domain.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Document(collection = "Product")
public class Product implements Serializable {
    @Id
    private int id;
    private String imagePath;
    private String title;
    private String description;

    public Product(int id, String imagePath, String title, String description) {
        this.id = id;
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }
}
