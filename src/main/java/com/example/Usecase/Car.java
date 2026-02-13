package com.example.Usecase;

public class Car {
    int id;
    String Model;

    public Car() {
    }

    public Car(String model) {
        Model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return Model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Model='" + Model + '\'' +
                '}';
    }
}
