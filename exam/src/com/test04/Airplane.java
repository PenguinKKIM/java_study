package com.test04;

public class Airplane extends Plane {
	protected int distance;
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	Airplane(){}
	Airplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	
	@Override
	public int flight(int distance) {
		return fuelSize = fuelSize-(distance/10)*30;
	}
	
	@Override
	public int refuel(int fuel) {
		return super.refuel(fuel);
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
