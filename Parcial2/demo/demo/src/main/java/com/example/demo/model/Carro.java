package com.example.demo.model;

public class Carro {
    private String color;
    private String marca;
    private int costo;

    private int id;

    public Carro(int id, String color, String marca, int costo) {
        this.id = id;
        this.color = color;
        this.marca = marca;
        this.costo = costo;

    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getCosto() {
        return costo;
    }

    public int getId() {
        return id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", costo=" + costo +
                ", id=" + id +
                '}';
    }
}
