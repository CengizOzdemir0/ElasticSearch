package com.cengiz.elasticsearch.service;

import com.cengiz.elasticsearch.entities.Product;
import com.cengiz.elasticsearch.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public Iterable<Product> saveAll(List<Product> productList) {
        return productRepository.saveAll(productList);
    }

    public List<Product> findAllName(String name, int page) {
        Pageable pageable = PageRequest.of(page, 10);
        return productRepository.findByTitle(name, pageable);
    }

    public List<Product> findAll() {
        Iterable<Product> all = productRepository.findAll();
        return StreamSupport.stream(all.spliterator(), false)
                .collect(Collectors.toList());

    }


    public Product findById(String id) {
       return productRepository.findById(id).orElse(null);
    }

    public Long count() {
        return productRepository.count();
    }
    public Boolean existsById(String id) {
        return productRepository.existsById(id);
    }

}