package com.ironhack.lab_java_springboot_fundamentals.controller;

import com.ironhack.lab_java_springboot_fundamentals.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/temperature")
    public int temperature() {
        return weatherService.getTemperature();
    }

    @GetMapping("/weather/condition")
    public String condition() {
        return weatherService.getCondition();
    }

    @GetMapping("/weather/wind")
    public int wind() {
        return weatherService.getWindSpeed();
    }

    @GetMapping("/weather/all")
    public String all() {
        return "Temp: " + weatherService.getTemperature() + "°C, " +
               "Condition: " + weatherService.getCondition() + ", " +
               "Wind: " + weatherService.getWindSpeed() + " km/h";
    }
}
