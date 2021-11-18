package ru.gb.service;

import ru.gb.entity.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    public List<Product> createNewProduct() {
        List<Product> products = Arrays.asList(
                new Product("Говядина", 1.1, "мясо охлаждённое"),
                new Product("Свинина", 3.2, "мясо охлаждённое"),
                new Product("Курица", 2.5, "мясо охлаждённое"),
                new Product("Баранина", 1.2, "мясо охлаждённое"),
                new Product("Сосиски", 1.7, "полуфабрикаты"),
                new Product("Пельмени", 3.5, "полуфабрикаты"),
                new Product("Наггетсы", 1, "полуфабрикаты"),
                new Product("Брокколи", 4, "замороженные овощи"),
                new Product("Фасоль", 2.5, "замороженные овощи"),
                new Product("Цветная капуста", 0.8, "замороженные овощи")
        );
        return products;
    }
}
