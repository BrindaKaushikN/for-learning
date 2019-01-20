package com.example.operations;


import com.example.model.Product;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

public interface ProductOperations {
    void create(Product product);

    Product getById(@NotBlank Long id);

    List<Product> getAll();

    void update(@NotBlank Long id, Product product);

}
