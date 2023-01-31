package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarListByCount(int count) {
        if (count < 0) {
            count = 0;
        }
        if (count > 5) {
            count = 5;
        }
        return carDao.getCarsList().stream().limit(count).toList();
    }
}
