package com.test04;

public class PlaneTest {

	// Airplane과 Cargoplane 객체생성
	// 생성된 객체의 정보 출력
	
	// Airplane과 Cargoplane 객체에 100씩 운항
	// 운항후 객체의 변경된 정보 출력
	// Airplane과 Cargoplane 객체에 200씩 주유
	// 주유후 객체의 변경된 정보 출력

//	Airplane L777 1000
//	Cargoplane C50 1000

	public static void main(String[] args) {
		Airplane air = new Airplane("L777", 1000);
		Cargoplane car = new Cargoplane("C50", 1000);
				
		System.out.println("Plane fuelSize");
		System.out.println("==================");
		System.out.println(air.toString());
		System.out.println(car.toString());
				
		System.out.println("Plane fuelSize");
		System.out.println("==================");
		air.flight(100);
		car.flight(100);
		System.out.println(air.toString());
		System.out.println(car.toString());
		System.out.println("100운항");
		
		
		
		System.out.println("Plane fuelSize");
		System.out.println("==================");
		air.refuel(200);
		car.refuel(200);
		System.out.println(air.toString());
		System.out.println(car.toString());
		System.out.println("200주유");
		
	}
}
