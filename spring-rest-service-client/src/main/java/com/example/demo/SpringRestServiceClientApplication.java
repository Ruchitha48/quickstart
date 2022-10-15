package com.example.demo;



import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Fee;

@SpringBootApplication
public class SpringRestServiceClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringRestServiceClientApplication.class, args);
	RestTemplate template=ctx.getBean(RestTemplate.class);
	String choice="get";
	String url="http://localhost:4040/api/v1/fees";
	if(choice.equals("get")) {
		Fee[] list=template.getForObject(url, Fee[].class);
		for(Fee eachItem:list) {
			System.out.println(eachItem);
		}
	}
	else if(choice.equals("get")) {
		Map<String,Object> data=new HashMap<>();
		data.put("id", 103);
		data.put("branch", "MBA");
		data.put("year", "II year");
		data.put("amount", 5000);
				HttpHeaders header=new HttpHeaders();
				header.setContentType(MediaType.APPLICATION_JSON);
				HttpEntity<Map<String,Object>> entity=new HttpEntity<>(data);
		ResponseEntity<Fee> resp=template.postForEntity(url, entity,Fee.class);
		System.out.println("status code:"+resp.getStatusCode());
		System.out.println("element added"+resp.getBody());
		System.out.println("location of the newly added element"+resp.getHeaders().getFirst("location"));
	}
	}
@Bean
public RestTemplate template() {
	return new RestTemplate();
}
}
