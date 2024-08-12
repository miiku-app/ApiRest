package com.example.restapi.controller;

import com.example.restapi.dto.ProductDTO;
import com.example.restapi.service.ProductService;
import com.example.restapi.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products", produces = "application/json")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(value = "/products")
    public ResponseEntity<Void> saveProduct(@RequestBody ProductDTO productDTO) {
        productService.createProduct(productDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/{productoId}")
    public ResponseEntity<Void> updateProduct(@PathVariable int productoId, @RequestBody ProductDTO productoDTO) {
        productService.updateProduct(productoId, productoDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
