package shape1;

public class Rectangle extends Shape {
//	(2) 클래스명 : Rectangle !!
//	조상클래스 : Shape !!
//	멤버변수 : int width - 폭
//	int height - 높이
	
	int width; //폭
	int height; // 높이
	

	public Rectangle () {}
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	
	public boolean isSquare() {
		if (width != height) {
			return false;
		}
		return true;
	}
	
	
	@Override
	double calcArea() {
		return width*height;
	}

}
