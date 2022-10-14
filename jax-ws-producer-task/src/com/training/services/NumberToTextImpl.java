package com.training.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.ifaces.NumberToTextService;


@WebService(endpointInterface = "com.training.ifaces.NumberToTextService")
public class NumberToTextImpl implements NumberToTextService {
	@Override
	@WebMethod
	@WebResult(name="Number to string")
	public String numberToText(@WebParam(name="number")int number) {
		
		String res=null;
		if (number==6)
			res= "six";
		if(number==7)
			res="seven";
		if(number==8)
			res="eight";
		return res;
		
	}


}
