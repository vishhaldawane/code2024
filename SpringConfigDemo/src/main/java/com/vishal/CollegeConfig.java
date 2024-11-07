package com.vishal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // <-- is the 3rd way to describe and load your beans
public class CollegeConfig {
	@Bean			 //below method name is the ID for the bean
	public College collegeBean() {
		return new College();
	}
}
