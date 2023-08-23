package shapes;

public class Circle extends Shape {
	Point center;
	int radius;

	public Circle(String color, Point center, int radius) {
		super(color, center.getX(), center.getX());
		this.radius = radius;
	}
	
	@Override
	public String info() {
		return "원 :" + color +" 중심점" + center + " 반지름"+ radius;
	}
	
}
