package sda99.carrental;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private static List<Car> cars = new ArrayList();

    static {
        cars.add(new Car(CarBrand.BMW, "X5", 2020, 5.0, "PO 12345"));
        cars.add(new Car(CarBrand.AUDI, "A5", 2018, 2.0, "ZS 76532"));
        cars.add(new Car(CarBrand.MAZDA, "CX-5", 2022, 2.0, "DW 09313"));
    }

    @RequestMapping("/cars")
    public String carView(Model model) {
        model.addAttribute("cars", cars);

        return "cars-view";
    }

}
