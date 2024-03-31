package org.humber.project.services.impl;

import java.util.List;

import org.humber.project.domain.Product;
import org.humber.project.services.ProductJdbcService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductJdbcServiceImpl implements ProductJdbcService {
    private final JdbcTemplate jdbcTemplate;

    public ProductJdbcServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll() {
        return jdbcTemplate.query("SELECT * FROM product", new BeanPropertyRowMapper<>(Product.class));
    }

    public void insert(Product product) {
        jdbcTemplate.update(
                "INSERT INTO product (product_id, product_name, product_price, product_desc, product_category,product_image,product_rate) VALUES (?, ?, ?, ?, ?,? ,?);",
                product.getProduct_id(), product.getProduct_name(), product.getProduct_price(),
                product.getProduct_desc(), product.getProduct_category(), product.getProduct_image(),
                product.getProduct_rate());

    }

    public void update(Product product) {
        jdbcTemplate.update(
                "UPDATE product SET product_name = ?, product_price = ?, product_desc = ?, product_category = ?, product_image = ?,product_rate=? WHERE product_id = ?;",
                product.getProduct_name(), product.getProduct_price(),
                product.getProduct_desc(), product.getProduct_category(), product.getProduct_image(),
                product.getProduct_rate(),
                product.getProduct_id());
    }

    @Override
    public void save(Product product) {
        if (product.getProduct_id() != null) {
            // If product has an ID, update the existing record
            update(product);
        } else {
            // If product does not have an ID, insert a new record
            insert(product);
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public List<Product> searchProducts(String keyword) {
        String sql = "SELECT * FROM product WHERE product_name LIKE ?";
        return jdbcTemplate.query(sql, new Object[] { "%" + keyword + "%" },
                new BeanPropertyRowMapper<>(Product.class));
    }

    @Override
    public void updateProductRating(Long productId, int rating) {
        jdbcTemplate.update(
                "UPDATE product SET product_rate = ? WHERE product_id = ?;",
                rating,
                productId);
    }

}
