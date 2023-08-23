package shapes;

public abstract class  Shape {
	String color;
	public Shape() {}
	public Shape(String color) {
		this.color = color;
	}
	public Shape(String color, int x, int y) {
		this.color = color;
	}
	
	public abstract String info();
}
