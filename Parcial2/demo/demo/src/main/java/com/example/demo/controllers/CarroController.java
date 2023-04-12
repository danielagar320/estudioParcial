package com.example.demo.controllers;

import com.example.demo.model.Carro;
import com.example.demo.service.CarroServiceImpl;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    CarroServiceImpl carroService;


    @GetMapping
    public ArrayList<Carro> getAllCars(){

        return carroService.getAllCars();
    }
    @GetMapping("/{id}")
    public Carro getById(@PathVariable int id){
        return carroService.getById(id);
    }

    @PostMapping
    public Carro saveCar(@RequestBody Carro carro) {
        return carroService.saveCar(carro);
    }


    @DeleteMapping("/{id}")
    public Carro deleteCar(@PathVariable int id) {
        return carroService.deleteCar(id);
    }

    @PutMapping("/{id}")
    public Carro updateCar(@PathVariable int id, @RequestBody Carro carro) {
        return carroService.updateCar(id, carro);
    }
}
