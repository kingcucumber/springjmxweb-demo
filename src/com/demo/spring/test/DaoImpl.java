package com.demo.spring.test;

import java.util.Calendar;

public class DaoImpl implements IDao {

	
	public String sayHello(String name){
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour < 12) return "good,moring! " + name;
		if(hour < 18) return "good,afternoon! " + name;
		
		return "good,night! " + name;
	}
	public String sayBye(String name){
		return "Bye,Bye!";
	}
}
