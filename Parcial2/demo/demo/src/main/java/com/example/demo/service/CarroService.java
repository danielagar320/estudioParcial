package com.example.demo.service;

import com.example.demo.model.Carro;

import java.util.ArrayList;

public interface CarroService {

    public ArrayList<Carro> getAllCars();

    public Carro getById(int i);

    public Carro saveCar(Carro carro);

    public Carro deleteCar(int id);

    public Carro updateCar(int id, Carro carro);
}
