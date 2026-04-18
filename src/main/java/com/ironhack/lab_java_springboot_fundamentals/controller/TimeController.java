package com.ironhack.lab_java_springboot_fundamentals.controller;

import com.ironhack.lab_java_springboot_fundamentals.service.TimeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String time() {
        return timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String date() {
        return timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String day() {
        return timeService.getDayOfWeek();
    }

    @GetMapping("/all")
    public String all() {
        return "Time: " + timeService.getCurrentTime() + ", " +
               "Date: " + timeService.getCurrentDate() + ", " +
               "Day: " + timeService.getDayOfWeek();
    }
}
