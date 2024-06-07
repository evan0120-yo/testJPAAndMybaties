package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.person.Person;


public interface PerosnRepository extends JpaRepository<Person,String> {

}
