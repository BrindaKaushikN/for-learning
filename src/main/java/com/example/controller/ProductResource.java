package com.example.controller;

import com.example.model.Product;
import com.example.operations.ProductOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/product")
public class ProductResource {

    @Autowired
    private ProductOperations productOperations;

    @RequestMapping(
            value = "",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void create(@RequestBody Product product) {
        productOperations.create(product);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Product getById(@PathVariable Long id) {
        return productOperations.getById(id);
    }

    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Product> getAll() {
        return productOperations.getAll();
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void update(@PathVariable Long id, @RequestBody Product product) {
        productOperations.update(id, product);
    }


}
