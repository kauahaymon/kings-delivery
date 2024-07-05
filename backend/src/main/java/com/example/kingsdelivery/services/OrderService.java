package com.example.kingsdelivery.services;

import com.example.kingsdelivery.DTO.OrderDTO;
import com.example.kingsdelivery.entities.Order;
import com.example.kingsdelivery.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findAll();
        return list.stream().map(OrderDTO::new).toList();
    }
}
