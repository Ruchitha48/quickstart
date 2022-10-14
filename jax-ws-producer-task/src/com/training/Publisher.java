package com.training;

import javax.xml.ws.Endpoint;

import com.training.services.NumberToTextImpl;




public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9000/weather", new NumberToTextImpl());
System.out.println("service started");
	}
}
