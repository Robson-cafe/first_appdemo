package com.example.first_appdemo.services;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class ShoppingTypeService implements TypeService {
    public double CalcType(String veículo) {
        if (veículo.equals("carro")) {
            return 6.0;
        }
        else{
            return 3.0;
        }
    }
}
