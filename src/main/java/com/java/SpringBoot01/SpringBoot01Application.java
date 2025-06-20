package com.java.SpringBoot01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot01Application.class, args);
		Voter v = container.getBean(Voter.class);
		if(v.check(22)) {
		System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		
		container.close();
		
		
	}

}
