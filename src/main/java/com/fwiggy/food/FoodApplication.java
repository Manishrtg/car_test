package com.fwiggy.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodApplication {

	public static void main(String[] args) {
		System.out.println("I am manish");
		System.out.println("I am Manish's Brother Price");
		System.out.println("I am Manish's Sister Pooja");
		System.out.println("I am Manish's Sister Priya");
		SpringApplication.run(FoodApplication.class, args);
	}
}
