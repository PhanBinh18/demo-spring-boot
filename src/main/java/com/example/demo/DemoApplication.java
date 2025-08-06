package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Autowired
	private CalculatorService calculatorService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/tih")
	public String hello(){
		return "Hello World";
	}
	@GetMapping("/list")
	public List<String> hello1(){
		return List.of("Hello", "World");
	}
	@GetMapping("/")
	public String tinhTong(@RequestParam(name = "a", defaultValue = "1") int a,
						   @RequestParam(name = "b", defaultValue = "2") int b){
		int ketQua = calculatorService.tinhTong(a, b);
		return String.format("Tong cua %d va %d la: %d", a, b, ketQua);
	}
}
