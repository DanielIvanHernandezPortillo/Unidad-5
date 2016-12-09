package mx.utng.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class Practice5Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
	return application.sources(Practice5Application.class);	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Practice5Application.class, args);
	}
}
