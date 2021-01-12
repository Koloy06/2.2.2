package web.dao;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Mersedes", 233));
        cars.add(new Car(2, "Audi", 777));
        cars.add(new Car(3, "Lamborghini", 555));
        cars.add(new Car(4, "Vaz", 239));
        cars.add(new Car(5, "BMW", 643));
    }

    public List<Car> getCars(int count) {
        List<Car> carsCount = new ArrayList<>();
        if (count < cars.size() && count > 0) {
            for (int i = 0; i < count; i++) {
                carsCount.add(cars.get(i));
            }
            return carsCount;
        }
        return getCars();
    }

    public List<Car> getCars() {
        return cars;
    }
}
