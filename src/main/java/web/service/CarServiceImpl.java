package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    List<Car> cars;
    private static int CAR_COUNT;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "Model1", 1));
        cars.add(new Car(++CAR_COUNT, "Model2", 2));
        cars.add(new Car(++CAR_COUNT, "Model3", 3));
        cars.add(new Car(++CAR_COUNT, "Model4", 4));
        cars.add(new Car(++CAR_COUNT, "Model5", 5));
    }

    @Override
    public List<Car> show(int count){
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
