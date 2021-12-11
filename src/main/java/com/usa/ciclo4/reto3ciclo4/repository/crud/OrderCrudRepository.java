package com.usa.ciclo4.reto3ciclo4.repository.crud;

import com.usa.ciclo4.reto3ciclo4.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
}
