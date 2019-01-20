package com.example.operations;


import com.example.model.Order;

import java.util.List;

public interface OrderOperations {


    Order create(Order order);

    Order getById(Long id);

    List<Order> getAll();

    void update(Long id, Order order);


    void delete(Long id);

}

