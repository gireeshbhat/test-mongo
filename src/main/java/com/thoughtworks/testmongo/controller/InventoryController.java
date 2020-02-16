package com.thoughtworks.testmongo.controller;

import com.thoughtworks.testmongo.model.Item;
import com.thoughtworks.testmongo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class InventoryController {

    @Autowired
    InventoryRepository repository;

    @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public void pushUser(@RequestBody Item item) {
        System.out.println("POST Request");
        repository.save(item);
    }

    @GetMapping("/")
    public List<Item> allItems() {
        System.out.println("GET Request");
        return repository.findAll();
    }
}
