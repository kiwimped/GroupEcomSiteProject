package org.humber.project.services;

import org.humber.project.domain.Product;

import java.util.List;

public interface ProductJdbcService {

    List<Product> findAll();

    void insert(Product product);

    void update(Product product);

    void save(Product product);

    List<Product> searchProducts(String keyword);

    void updateProductRating(Long productId, int rating);

}