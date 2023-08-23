package shapes;

public class Triangle extends Shape {
	Point p1;
	Point p2;
	Point p3;
	
	public Triangle() {}
	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color );
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public String info() {
		return "삼각형 :" + color +" 점1"+ p1 +" 점2" + p2 +" 점3"+ p3;
		
	}
	
}
