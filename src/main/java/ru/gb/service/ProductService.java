package ru.gb.service;

import ru.gb.entity.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    public List<Product> createNewProduct() {
        List<Product> products = Arrays.asList(
                new Product(1L, "Говядина", 450.0),
                new Product(2L, "Свинина", 350.0),
                new Product(3L, "Курица", 250.00),
                new Product(4L, "Баранина", 490.00),
                new Product(5L, "Сосиски", 510.00),
                new Product(6L, "Пельмени", 650.00),
                new Product(7L, "Наггетсы", 345.00),
                new Product(8L, "Брокколи", 189.00),
                new Product(9L, "Фасоль", 135.00),
                new Product(10L, "Цветная капуста", 90.50)
        );
        return products;
    }
}
