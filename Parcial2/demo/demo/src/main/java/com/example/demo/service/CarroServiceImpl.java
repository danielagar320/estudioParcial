package com.example.demo.service;

import com.example.demo.model.Carro;
import com.example.demo.repository.CarroRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarroServiceImpl implements CarroService{

    @Autowired
    CarroRepositoryImpl carroRepository;
    @Override
    public ArrayList<Carro> getAllCars() {
        return carroRepository.getAllCars();
    }

    @Override
    public Carro getById(int i) {
        return carroRepository.getById(i);
    }

    @Override
    public Carro saveCar(Carro carro) {
        return carroRepository.saveCar(carro);
    }

    @Override
    public Carro deleteCar(int id) {
        return carroRepository.deleteCar(id);
    }

    @Override
    public Carro updateCar(int id, Carro carro) {
        return carroRepository.updateCar(id, carro);
    }
}
