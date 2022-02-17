package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    private final CarService carService;

    public CarsController(CarServiceImpl carServiceImpl) {
        this.carService = carServiceImpl;
    }

    @GetMapping()
    public String getListCars(@RequestParam(value = "count", required = false) Integer count,
                              Model model) {
        model.addAttribute("cars_list", carService.getListCars(count));
        return "cars";
    }
}
