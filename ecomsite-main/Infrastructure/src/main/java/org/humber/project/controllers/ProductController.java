package org.humber.project.controllers;

import org.humber.project.domain.Product;
import org.humber.project.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.insertProduct(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setProduct_id(id);
        productService.updateProduct(product);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword) {
        List<Product> products = productService.searchProducts(keyword);
        return ResponseEntity.ok(products);
    }

    @PostMapping("/{id}/rating")
    public ResponseEntity<String> updateProductRating(@PathVariable Long id, @RequestBody int rating) {
        productService.updateProductRating(id, rating);
        return ResponseEntity.ok("Product rating updated successfully.");
    }
}