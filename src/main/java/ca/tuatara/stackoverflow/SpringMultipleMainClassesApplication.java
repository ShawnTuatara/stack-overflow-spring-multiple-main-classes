package ca.tuatara.stackoverflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMultipleMainClassesApplication {

	public static void main(String[] args) {
		System.out.println("In the default main class");
		SpringApplication.run(SpringMultipleMainClassesApplication.class, args);
	}
}
