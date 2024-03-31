CREATE TABLE IF NOT EXISTS product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(255),
    product_price DECIMAL(10, 2),
    product_desc VARCHAR(1000),
    product_category VARCHAR(255),
    product_image VARCHAR(255),
    product_rate INT(11)
);

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (1, 'Handcrafted Leather Journal', 49.99, 'Beautifully handcrafted leather journal with intricate detailing.', 'Stationery', 'leather_journal_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (2, 'Personalized Engraved Jewelry', 79.99, 'Customizable jewelry with engraved names, dates, or special messages.', 'Jewelry', 'engraved_jewelry_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (3, 'Classic Leather Briefcase', 129.99, 'Timeless leather briefcase for a professional look.', 'Fashion', 'leather_briefcase_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (4, 'Wireless Bluetooth Headphones', 89.99, 'High-quality wireless headphones for an immersive audio experience.', 'Electronics', 'bluetooth_headphones_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (5, 'Modern L-Shaped Desk', 249.99, 'Sleek and functional L-shaped desk for a contemporary workspace.', 'Furniture', 'lshaped_desk_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (6, 'Fitness Tracker Watch', 59.99, 'Track your fitness goals with this advanced smartwatch.', 'Fitness', 'fitness_tracker_watch_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (7, 'Gourmet Coffee Gift Set', 39.99, 'Deluxe coffee collection for coffee enthusiasts.', 'Food & Beverage', 'coffee_gift_set_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (8, 'Abstract Canvas Wall Art', 69.99, 'Elevate your home decor with this unique abstract canvas art.', 'Home Decor', 'canvas_wall_art_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (9, 'Stainless Steel Cooking Set', 149.99, 'Premium stainless steel cookware set for a top-notch kitchen.', 'Home & Kitchen', 'cooking_set_image.jpg');

INSERT IGNORE INTO product (product_id, product_name, product_price, product_desc, product_category, product_image) 
VALUES 
    (10, 'Digital Drawing Tablet', 179.99, 'Create digital art with precision using this graphics tablet.', 'Electronics', 'drawing_tablet_image.jpg');
