package com.example.first_appdemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class NormaTypeService implements TypeService {
    public double CalcType(String veículo) {
        if (veículo.equals("carro")) {
            return 2.0;
        }
        else{
            return 1.0;
        }
    }
}
