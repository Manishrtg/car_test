package com.fwiggy.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodApplication {

	public static void main(String[] args) {
		System.out.println("I am manish");
		SpringApplication.run(FoodApplication.class, args);
	}
}
