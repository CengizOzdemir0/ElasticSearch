package com.cengiz.elasticsearch.controller;


import com.cengiz.elasticsearch.entities.Product;
import com.cengiz.elasticsearch.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductRestController {

    final ProductService productService;

    @PostMapping("saveAll")
    public Iterable<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }

    @GetMapping("search")
    public List<Product> search(
            @RequestParam String title,
            @RequestParam int page

    ) {
        return productService.findAllName(title, page);
    }

    @GetMapping("findAll")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("findById")
    public Product findById(@RequestParam String id) {
        return productService.findById(id);
    }

    @GetMapping("count")
    public Long findById() {
        return productService.count();
    }
    @GetMapping("exist")
    public Boolean exist(@RequestParam String id) {
        return productService.existsById(id);
    }

}