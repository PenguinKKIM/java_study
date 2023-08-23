package shapes;

public class Rectangle extends Shape {
	Point point = new Point();
	
	Point startPoint;
	int width;
	int height;
	
	public Rectangle() {}
	public Rectangle(String color,int x, int y, int width, int heigh) {
		super(color);
		point.getX();
		point.getY();
		this.width = width;
		this.height = heigh;
	}
	public Rectangle(String color, Point startPoint,int width, int heigh) {
		super(color);
		this.width = width;
		this.height = heigh;
	}
	
	@Override
	public String info() {
		return "사각형 :" + color +" 시작점"+ startPoint +" 너비" + width +" 높이"+ height;
	}
	
	
}
