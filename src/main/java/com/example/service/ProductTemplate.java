package com.example.service;

import com.example.model.Product;
import com.example.operations.ProductOperations;
import com.example.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductTemplate implements ProductOperations {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public void update(Long id, Product product) {
        Product oldProduct = getById(id);
        if (!oldProduct.equals(product)) {
            productRepository.save(product);
        }

    }


}
