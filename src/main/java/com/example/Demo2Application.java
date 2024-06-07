package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.person.Person;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Demo2Application {
	
	@Autowired
	private PerosnRepository perosnRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		System.out.println("================= START OK  =================");
	}
	
	
	@PostConstruct
	private void init() {
		Person person01 = Person.builder()
				.personName("test01")
				.build();	
		perosnRepository.save(person01);
		System.out.println("person01 = "+person01);
		
		Person person02 = Person.builder()
				.personName("test02")
				.build();	
		perosnRepository.save(person02);
		System.out.println("person02 = "+person02);
	}
}
