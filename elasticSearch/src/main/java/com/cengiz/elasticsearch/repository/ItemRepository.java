package com.cengiz.elasticsearch.repository;

import com.cengiz.elasticsearch.entities.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends ElasticsearchRepository<Item, String> {
}