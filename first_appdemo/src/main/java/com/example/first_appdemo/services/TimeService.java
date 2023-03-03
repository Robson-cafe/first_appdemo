package com.example.first_appdemo.services;

import org.springframework.stereotype.Service;

@Service
public class TimeService {
    public double CalcTime (int minutos) {
        return Math.ceil(minutos / 15.0);
    }
}
