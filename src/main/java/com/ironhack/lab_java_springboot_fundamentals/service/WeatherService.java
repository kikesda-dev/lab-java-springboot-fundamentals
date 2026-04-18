package com.ironhack.lab_java_springboot_fundamentals.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class WeatherService {

    private Random random = new Random();

    public int getTemperature() {
        return random.nextInt(51) - 10;
    }

    public String getCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(4)];
    }

    public int getWindSpeed() {
        return random.nextInt(101);
    }
}
