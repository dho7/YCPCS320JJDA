package edu.ycp.cs320.jjda;

public class Station {

	String name = "";
	
	//so far every station will at least have a name, you can easily add other parameters to the station constructor
	//if needed in the future
	Station(String stationName){
		this.name = stationName;
	}
	
	public String getName(){
		return name;
	}
	
	
}
