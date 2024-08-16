package com.example.phone_shop.service;

import com.example.phone_shop.model.Product;

public interface IProductService {
    Iterable<Product> findAll();
}
