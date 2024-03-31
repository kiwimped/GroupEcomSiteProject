package org.humber.project.services;

import java.util.List;

import org.humber.project.domain.Product;

public interface ProductService {
    List<Product> getAllProducts();

    void insertProduct(Product product);

    void updateProduct(Product product);

    void save(Product product);

    List<Product> searchProducts(String keyword);

    void updateProductRating(Long productId, int rating); // Define the new method
}
