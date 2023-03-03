package com.example.first_appdemo;

//import com.example.first_appdemo.services.PayService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;*/

@SpringBootApplication
//@RestController passou pacote controler
public class FirstAppdemoApplication /*implements CommandLineRunner - implementação provisória para imprimir no terminal*/ {

	/*PayService payService;
	public FirstAppdemoApplication(PayService payService) {
		this.payService = payService;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(FirstAppdemoApplication.class, args);
	}

	//@GetMapping("/hello")
	/*@GetMapping("/hello/{name}")
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
	}*/

	/*@Override
	public void run(String... args) throws Exception {

		System.out.println(payService.CalcCust(78, "carro"));
	}*/
}
