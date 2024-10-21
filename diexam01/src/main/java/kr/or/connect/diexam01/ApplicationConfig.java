package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Car car(Engine e) {
		//     carr처럼 다르게 바꿔도 .class로 읽어오면 된다
		Car c = new Car();
		/*
		c.setEngine(e);
		*/
		return c;
	}
	@Bean
	public Engine engine() {
		return new Engine();
	}
}
