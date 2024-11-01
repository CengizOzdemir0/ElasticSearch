package com.cengiz.elasticsearch.entities;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "itemlist")
@Data
public class Item {

    @Id
    private String itemId;
    private String category;
    private String itemName;

}
