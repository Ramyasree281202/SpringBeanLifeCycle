package com.java.SpringBoot01;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Voter {
	static {
		System.out.println("Static init Block of Bean");
	}
	public Voter() {
		System.out.println("Bean is created");
	}
	@PostConstruct
	public void init() {
		System.out.println("init method annotated with constructor");
	}
	
	public boolean check(Integer age) {
		if(age>=20) {
			return true;
		}
		return false;
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method annotated with PreDestroy");
	}
	
}
