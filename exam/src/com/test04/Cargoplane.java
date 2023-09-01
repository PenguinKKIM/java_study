package com.test04;

//Cargoplane()
//+ Cargoplane(planeName:String,
//fuelSize:int )
//+ flight(distance:int) //운항


public class Cargoplane extends Plane{
	
	protected int distance;
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	Cargoplane(){}
	Cargoplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	
	
	
	@Override
	public int flight(int distance) {
		return fuelSize = fuelSize-(distance/10)*50;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
