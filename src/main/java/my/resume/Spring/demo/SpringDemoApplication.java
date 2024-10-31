package my.resume.Spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import my.resume.Spring.model.TestLombok;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		TestLombok testObject = new TestLombok();

		System.out.println(testObject.getTestField());

	}

}
