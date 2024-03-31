package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.Product;
import org.humber.project.services.ProductService;
import org.humber.project.services.ProductJdbcService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductJdbcService productJdbcService;

    @Override
    public List<Product> getAllProducts() {
        System.out.println("Retrieving all products");
        return productJdbcService.findAll();
    }

    @Override
    public void insertProduct(Product product) {
        productJdbcService.insert(product);
        System.out.println("Saved Record: " + product);
    }

    @Override
    public void updateProduct(Product product) {
        productJdbcService.update(product);
        System.out.println("Updated Record: " + product);
    }

    @Override
    public void save(Product product) {
        productJdbcService.save(product);
        System.out.println("Saved Record: " + product);
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return productJdbcService.searchProducts(keyword);
    }

    @Override
    public void updateProductRating(Long id, int rating) {
        // Implementation of updateProductRating method
        // This method should update the rating of the product with the specified id
        productJdbcService.updateProductRating(id, rating);
        System.out.println("Updated Record: " + id + rating);
    }
}
