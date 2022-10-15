package com.training.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.ifaces.WeatherService;
import com.training.model.Weather;
import com.training.model.WeatherWrapper;
@WebService(endpointInterface = "com.training.ifaces.WeatherService")
public class WeatherServiceImpl implements WeatherService {

	@Override
	@WebMethod
	@WebResult(name="current weather")
	public Weather getWeatherByCity(@WebParam(name="cityName")String cityName) {
		
		Weather weather=new Weather(cityName,32,27,60);
		
		if(cityName.equalsIgnoreCase("pune")){
			weather=new Weather(cityName,27,23,60);
		}
				
		return weather;
	}

	@Override
	@WebMethod
	public WeatherWrapper getWeatherByState(String stateName) {
		// TODO Auto-generated method stub
		Weather bang=new Weather("banglore",32,27,60);
		Weather bal=new Weather("ballari",36,32,60);
		List<Weather> list=new ArrayList<Weather>();
		list.add(bal);
		list.add(bang);
		WeatherWrapper obj=new WeatherWrapper(list);
		return obj;
	}

}

