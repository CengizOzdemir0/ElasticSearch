package com.cengiz.elasticsearch.repository;

import com.cengiz.elasticsearch.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {

    @Query("{\"match\": {\"title\": {\"query\": \"?0\"}}}")
    List<Product> findByTitle(String title, Pageable pageable);

}