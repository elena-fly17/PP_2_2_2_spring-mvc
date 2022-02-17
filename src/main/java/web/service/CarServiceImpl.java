package web.service;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao;
    public CarServiceImpl(CarDaoImpl carDaoImpl) {
        this.carDao = carDaoImpl;
    }

    @Override
    public List<Car> getListCars(Integer count) {
        return carDao.getListCars(count);
    }
}
