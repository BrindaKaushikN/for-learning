package com.example.controller;


import com.example.model.Order;
import com.example.operations.OrderOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/order")
public class OrderResource {

    @Autowired
    private OrderOperations orderOperations;

    @RequestMapping(
            value = "",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Order create(@RequestBody Order order) {

        return orderOperations.create(order);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Order getById(@PathVariable Long id) {
        return orderOperations.getById(id);
    }

    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Order> getAll() {
        return orderOperations.getAll();
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void update(@PathVariable Long id, @RequestBody Order order) {
        orderOperations.update(id, order);
    }

    @RequestMapping(
            value = "/remove/{id}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void delete(@PathVariable Long id) {
        orderOperations.delete(id);
    }


}
