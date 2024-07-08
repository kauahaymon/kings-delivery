package com.example.kingsdelivery.repositories;

import com.example.kingsdelivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
