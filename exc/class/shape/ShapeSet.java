package shapes;

public class ShapeSet {

	Shape[]	shapes = new Shape[100];
	int shapeCnt;
	
	public void add(Shape shape) {
		for(int i = 0; i < shapeCnt; i++) {
			shapes[shapeCnt++] = shape;
		}
	}
	
	public void allShapeDraw() {
		for(int i=0; i<shapeCnt; i++) {
			System.out.println(shapes[i].info());
		}
	}
}
