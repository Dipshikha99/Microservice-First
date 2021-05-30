package com.demo.rest.webservices.restfulwebservices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configaration ana enable swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	  public static final Contact DEFAULT_CONTACT
      = new Contact(
      "Dipshikha Dutta",
      "localhost:8080/index",
      "dipshikha@gmail.com");
  public static final ApiInfo DEFAULT_API_INFO
      = new ApiInfo(
      "Awesome Api Title",
      "Awesome Api Documentation",
      "1.0",
      "urn:tos",
      DEFAULT_CONTACT,
      "Apache 2.0",
      "http://www.apache.org/licenses/LICENSE-2.0",
      new ArrayList<>());
  
  	private static final Set<String> DEFAULT_PRODUCTS_AND_CONSUMES = 
			new HashSet<String>(Arrays.asList("application/json",
					"application/xml"));


	//Bean-Docket
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCTS_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCTS_AND_CONSUMES);
	}
	//Swagger 3
	//all the paths
	//all the apis
}
