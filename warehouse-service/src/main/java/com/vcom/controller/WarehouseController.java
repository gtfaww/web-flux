package com.vcom.controller;

import com.vcom.bean.Warehouse;
import com.vcom.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @GetMapping("/mock/{id}")
    public Warehouse getById(@PathVariable long id) {
        return service.mock(id);
    }

    @PostMapping("/add2")
    public boolean add2(@RequestBody Warehouse warehouse) {
        return service.add2(warehouse);
    }

    @PostMapping("/add")
    public Mono<Boolean> add(@RequestBody Warehouse warehouse) {
        return service.add(warehouse);
    }
}
