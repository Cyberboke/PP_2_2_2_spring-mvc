package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    /*
    При раскомментированном контроллере HelloController ни одна из страниц не выводится (совсем). Выдаётся ошибка 500.
    При закомментированном контроллере ошибок нет: есть и страница localhost:8080, и localhost:8080/cars.
    Не знаю, с чем это может быть связано и как это исправить.
     */

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String show(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("listCars", carService.show(count));
        return "cars";
    }
}
