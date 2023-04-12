package com.example.demo.repository;

import com.example.demo.model.Carro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public class CarroRepositoryImpl implements CarroRepository{

    private ArrayList<Carro> carros = new ArrayList<>();

    public CarroRepositoryImpl() {
        Carro mazda = new Carro(1,"rojo", "mazda", 105000000);
        carros.add(mazda);
    }

    @Override
    public ArrayList<Carro> getAllCars() {
        return carros;
    }

    @Override
    public Carro getById(int i) {
        for(Carro r: carros){
            if(r.getId()== i){
                return r;
            }
        }
        return null;
    }

    @Override
    public Carro saveCar(Carro carro) {
        carros.add(carro);
        return getById(carro.getId());
    }

    @Override
    public Carro deleteCar(int id) {
        Carro car =  getById(id);
        carros.remove(car);
        return car;
    }

    @Override
    public Carro updateCar(int id, Carro carro) {
        deleteCar(id);
        saveCar(carro);
        return carro;
    }
}
