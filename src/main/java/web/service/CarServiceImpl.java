package web.service;

import web.dao.CarDao;
import web.model.Car;
import java.util.List;

public class CarServiceImpl {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
