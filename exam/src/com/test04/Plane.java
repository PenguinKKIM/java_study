package com.test04;

//Plane: : abstract class
//- planeName: String
//- fuelSize:int
//+ Plane()
//+ Plane(planeName:String,
//fuelSize:int )
//+ refuel(fuel:int) //주유
//+ flight(distance:int) //운항


public abstract class Plane {
	protected String planeName;
	protected int fuelSize;
	protected int fuel;

	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	Plane(){}
	Plane(String planeName, int fuelSize ){
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public int refuel(int fuel) {
		return fuel + fuelSize;
	}
	
	@Override
	public String toString() {
		return planeName +" "+fuelSize;
	}
	
	public abstract int flight(int distance);

}
