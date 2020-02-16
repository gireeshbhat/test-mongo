package com.thoughtworks.testmongo.repository;

import com.thoughtworks.testmongo.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends MongoRepository<Item, Integer> {
}
