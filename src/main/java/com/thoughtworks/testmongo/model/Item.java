package com.thoughtworks.testmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Item {

    @Id
    private String itemId;
    private String name;
    private Double price;
    private Integer availableQuantity;

    public Item(String name, Double price, Integer availableQuantity) {
        this.name = name;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
}
