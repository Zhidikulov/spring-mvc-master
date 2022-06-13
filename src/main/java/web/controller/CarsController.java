package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int value, Model model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2022, "black"));
        cars.add(new Car("Toyota", 2018, "gray"));
        cars.add(new Car("AUDI", 2020, "white"));
        cars.add(new Car("Mersedes-Benz", 2021, "blue"));
        cars.add(new Car("Volvo", 2000, "silver"));
        cars = CarService.carCount(cars, value);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
