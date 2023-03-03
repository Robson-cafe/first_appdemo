package com.example.first_appdemo.controllers;

import com.example.first_appdemo.services.PayService;
import com.example.first_appdemo.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    PayService payService;
    /*public Controller(PayService payService) {
        this.payService = payService;
    }*/
    @Autowired
    TypeService typeService;

    @GetMapping("/hello/{name}")
    public String hello(
            //@RequestParam(value = "name", defaultValue = "World") String name) {
            @PathVariable("name") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/calc_cost")
    public double CalcCost(
            @RequestParam(name = "veiculo", defaultValue = "moto") String veiculo,
            @RequestParam(name = "minutos", defaultValue = "0") int minutos) {
        return payService.CalcCust(minutos, veiculo);
    }

    @GetMapping("/price_by_type")
    public double PriceByType(
            @RequestParam(name = "veiculo", defaultValue = "moto") String veiculo) {
        return typeService.CalcType(veiculo);
    }
}
