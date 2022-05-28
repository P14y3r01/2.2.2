package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class carsHelper implements carsHelp{
    private List<Car> listCars = new ArrayList<>();

    public carsHelper(List<Car> listCars)  {
        this.listCars = listCars;
        Car car1 = new Car("Car1", 100, "country1");
        Car car2 = new Car("Car2", 200, "country2");
        Car car3 = new Car("Car3", 300, "country3");
        Car car4 = new Car("Car4", 400, "country4");
        Car car5 = new Car("Car5", 500, "country5");

        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);


    }
    @Override
    public List<Car> allCars(){
        return listCars;
    }
    @Override
    public List<Car> countCars(int i){
        return i>0 && i<5 ? listCars.subList(0,i) : listCars;
    }
}
