package web.service;

import web.model.Car;

import java.util.List;

public interface carsHelp {
    public default List<Car> allCars() {
        return null;
    }


    public default List<Car> countCars(int i) {
        return null;
    }   

}
