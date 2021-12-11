package com.usa.ciclo4.reto3ciclo4.controller;

import com.usa.ciclo4.reto3ciclo4.model.Order;
import com.usa.ciclo4.reto3ciclo4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrder(@PathVariable("id") int id){
        return orderService.getOrder(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Order order){
        orderService.save(order);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Order order){
        orderService.update(order);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return orderService.delete(id);
    }

    @GetMapping("/zona/{zone}")
    public List<Order> getOrdersByZone(@PathVariable("zone") String zone){
        return orderService.getOrderByZone(zone);
    }
}
