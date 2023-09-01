package com.test02;

public class Student extends Human {
//	- number:String
//	- major:String
//	+ Student()
//	+ Student(name:String,
//	age:int, height:int, weight:int,
//	number:String, major:String )
//	+ toString():String
	
	
	String number;
	String major;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	Student(){}
	Student(String name, int age, int height, int weight,String number,String major ){
		super(name,age,height,weight);
		this.number = number;
		this.major = major;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() + number + " " + major;
		}
	
}
