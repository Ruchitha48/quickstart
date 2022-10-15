package com.training;

public class Application {
 public static void main(String[]args) {
//	 WeatherService service=new WeatherServiceImplService().getWeatherServiceImplPort()
//; 
//System.out.println("weather in pune : "+service.getWeatherByCity("pune"));	
//System.out.println("weather in Banglore : "+service.getWeatherByCity("Banglore"));	
 WeatherService service=new WeatherServiceImplService().getWeatherServiceImplPort();
 WeatherWrapper  wrapper=service.getWeatherByState("ap");
wrapper.getList().forEach(System.out::println);
 System.out.println(service.getWeatherByCity("ballari"));
 
 }
}
