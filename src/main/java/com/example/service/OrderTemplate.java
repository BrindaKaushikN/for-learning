package com.example.service;


import com.example.model.Order;
import com.example.operations.OrderOperations;
import com.example.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderTemplate implements OrderOperations {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order create(Order order) {

        return orderRepository.save(order);

    }

    @Override
    public Order getById(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    public List<Order> getAll() {
        return (List<Order>) orderRepository.findAll();
    }

    @Override
    public void update(Long id, Order order) {

        Order oldOrder = getById(id);
        if (!oldOrder.equals(order)) {
            orderRepository.save(order);
        }
    }


    @Override
    public void delete(Long id) {
        orderRepository.delete(id);
    }


}
