package com.example.kingsdelivery.repositories;

import com.example.kingsdelivery.DTO.ProductDTO;
import com.example.kingsdelivery.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByOrderByName();
}
