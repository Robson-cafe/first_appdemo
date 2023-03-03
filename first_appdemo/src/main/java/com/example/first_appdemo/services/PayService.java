package com.example.first_appdemo.services;

import org.springframework.stereotype.Service;

@Service
public class PayService {
    /*TimeService timeService = new TimeService();
    TypeService typeService =  new TypeService();*/
    TimeService timeService;
    TypeService typeService;
    public PayService(TimeService timeService, TypeService typeService) {
        this.timeService = timeService;
        this.typeService = typeService;
    }

    public double CalcCust(int minutos, String veiculo) {
        return timeService.CalcTime(minutos) * typeService.CalcType(veiculo);
    }
}
