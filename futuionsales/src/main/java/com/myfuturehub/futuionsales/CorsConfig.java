package com.myfuturehub.futuionsales;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Allow CORS for all paths
				.allowedOrigins("*") // Replace with your frontend's URL
				.allowedMethods("GET", "POST", "PUT", "DELETE") // Allowed HTTP methods
				.allowedHeaders("*"); // Allowed headers
	}
}
