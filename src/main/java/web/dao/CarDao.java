package web.dao;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        if (count < cars.size() && count > 0) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
}
