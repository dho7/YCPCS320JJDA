package edu.ycp.cs320.jjda;

import java.util.Map;
import java.util.TreeMap;

public class Directory {

	Map<String, String> phoneNumbers = new TreeMap();
	
	public void addPhoneNumber(String name, String number){
		phoneNumbers.put(name , number);
	}
	
	public String getPhoneNumber(String name){
		return phoneNumbers.get(name);
	}
	
}
