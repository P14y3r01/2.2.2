package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.carsHelper;

@Controller
@RequestMapping("/")
public class CarController {

    private carsHelper carshelp;

    @Autowired
    public CarController(carsHelper carshelp) {
        this.carshelp = carshelp;
    }

    @GetMapping("cars")
    public String allCars(@RequestParam(value = "count", required = false, defaultValue = "0") int i, ModelMap model) {
        model.addAttribute("listCars", carshelp.countCars(i));
        return "cars";
    }
}
