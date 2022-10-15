package com.example.demo;



import com.example.entity.Fee;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Application {

	public static void main(String[]args) {
	Client	client=ClientBuilder.newClient();
	
	WebTarget target=client.target("http://localhost:3030/api/v1/fees");
	
	Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON);
	
	String choice="post";
	if(choice.equals("get")) {
	Response res=builder.get();
	Fee[] list=res.readEntity(Fee[].class);
	for(Fee eachItem:list) {
		System.out.println(eachItem);
	}
	
	
	}
	if(choice.equals("post")) {
		Fee objectToAdd=new Fee(108,"civil","II year",6500);
		
		Response postRes=builder.post(Entity.entity(objectToAdd,MediaType.APPLICATION_JSON));
	int statusCode=postRes.getStatus();
	if(statusCode==201) {
		System.out.println("Status code"+postRes.getStatus());
	System.out.println("Record added"+postRes.readEntity(Fee.class));
	}
	else {
		System.out.println("Status code"+postRes.getStatus());
		System.out.println("Element already exist");
	}
	}
}
}