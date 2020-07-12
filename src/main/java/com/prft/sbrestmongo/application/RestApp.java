package com.prft.sbrestmongo.application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication

public class RestApp {

	public static void main(String[] args) {
		SpringApplication.run(RestApp.class, args);
	}

	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	   return new WebMvcConfigurerAdapter() {
	      @Override
	      public void addCorsMappings(CorsRegistry registry) {
	         registry.addMapping("/customers").allowedOrigins("http://localhost:9090");
	      }    
	   };
	}

	/*
	 * @RequestMapping(value = "/") public String hello() { return "Hello Welcome";
	 * }
	 */
	 
}
