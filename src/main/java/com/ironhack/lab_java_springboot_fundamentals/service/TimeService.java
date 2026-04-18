package com.ironhack.lab_java_springboot_fundamentals.service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Service
public class TimeService {

    public String getCurrentTime() {
        return LocalTime.now().toString().substring(0, 8);
    }

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getDayOfWeek() {
        return LocalDateTime.now().getDayOfWeek().toString();
    }
}
