package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl {

    private final CarDao carDao;

    public CarServiceImpl() {
        this.carDao = new CarDao();
    }

    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
