package com.cengiz.elasticsearch.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "allproducts")
@Data
public class Product {

    @Id
    private String pid;
    @Field(type = FieldType.Text)
    private String title;
    private String description;
    private Integer price;

}