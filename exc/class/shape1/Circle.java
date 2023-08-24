package shape1;

public class Circle extends Shape {
//	(1) 클래스명 : Circle !!
//	조상클래스 : Shape !!
//	멤버변수 : double r - 반지름
	
	double r; // 반지름
	final double PI = 3.14;
	
	public Circle(){}
	public Circle(double r){
		this.r = r;
	}
	
	@Override
	double calcArea() {
		return r*r*PI;
	}

}
