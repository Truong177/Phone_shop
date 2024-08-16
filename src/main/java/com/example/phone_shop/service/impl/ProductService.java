package com.example.phone_shop.service.impl;

import com.example.phone_shop.model.Product;
import com.example.phone_shop.repository.IProductRepository;
import com.example.phone_shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;


    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }
}
