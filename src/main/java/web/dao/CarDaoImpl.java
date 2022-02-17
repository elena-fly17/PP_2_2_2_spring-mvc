package web.dao;
import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> listCars;
    {
        listCars = new ArrayList<>();
        listCars.add(new Car("Honda", "red", 1111));
        listCars.add(new Car("Nissan", "red", 2222));
        listCars.add(new Car("Kia", "white", 3333));
        listCars.add(new Car("BMV", "black", 4444));
        listCars.add(new Car("Mazda", "grey", 5555));
    }

    @Override
    public List<Car> getListCars(Integer count) {
        if (count == null || count >= 5) {
            return listCars.subList(0, listCars.size());
        } else return listCars.subList(0, count);
    }
}
