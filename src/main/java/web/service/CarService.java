package web.service;
import web.models.Car;
import java.util.List;

public interface CarService {
    List<Car> getListCars(Integer count);
}
