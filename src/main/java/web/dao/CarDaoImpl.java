package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", 1000000, 3));
        cars.add(new Car("Nissan", 2000000, 5));
        cars.add(new Car("Dodge", 2500000, 2));
        cars.add(new Car("BMW", 1500000, 4));
        cars.add(new Car("Lada", 800000, 7));
    }

    @Override
    public List<Car> getCarsList() {
        return cars;
    }
}
