package com.example.inventory_management.service;

import com.example.inventory_management.model.Product;
import com.example.inventory_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        // Assign the next available ID
        product.setId(getNextId());
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        // Check if the product exists
        Optional<Product> product = productRepository.findById(id);
        if (!product.isPresent()) {
            throw new RuntimeException("Product not found");
        }
        // Proceed to delete if it exists
        productRepository.deleteById(id);
    }

    // Helper method to get the next available ID
    private Long getNextId() {
        List<Product> products = productRepository.findAll();
        if (products.isEmpty()) {
            return 1L; // Start from 1 if no products exist
        }
        // Find the lowest available ID
        Set<Long> existingIds = new HashSet<>();
        for (Product product : products) {
            existingIds.add(product.getId());
        }

        Long nextId = 1L;
        while (existingIds.contains(nextId)) {
            nextId++;
        }
        return nextId; // Return the next available ID
    }
}
