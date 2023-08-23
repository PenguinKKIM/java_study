package exc;


class MyPoint{
	int x;
	int y;
	
//	double getDistance(int x1, int y1) {
//		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
//	}
	
	double getDistance(MyPoint pos) {
		return Math.sqrt((x-pos.x)*(x-pos.x) + (y-pos.y)*(y-pos.y));
	}


}

public class Ex4 {
	public static void main(String[] args) {
		
		MyPoint pos1 = new MyPoint();
		pos1.x = 1;
		pos1.y = 1;
		
		MyPoint pos2 = new MyPoint();
		pos2.x = 2;
		pos2.y = 2;
		
		
//		System.out.println(pos1.getDistance(2,2));
		System.out.println(pos1.getDistance(pos2));
	}
}
