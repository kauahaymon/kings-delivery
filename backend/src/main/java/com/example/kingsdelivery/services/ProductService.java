package com.example.kingsdelivery.services;

import com.example.kingsdelivery.DTO.ProductDTO;
import com.example.kingsdelivery.entities.Product;
import com.example.kingsdelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByName();
        return list.stream().map(ProductDTO::new).toList();
    }
}
