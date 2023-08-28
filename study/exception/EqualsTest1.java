class Complex {
	int real;
	int imaginary;

	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	@Override
	public String toString() {
		return String.format("%d + %di",real, imaginary);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Complex == false) {
			return false;
		}
		Complex c = (Complex) obj;
		return real == c.real && imaginary == c.imaginary;
	}
}

public class EqualsTest1 {

	public static void main(String[] args) {
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(3, 5);
		Complex c3 = new Complex(5, 3);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1); //
		System.out.println(c3); //
	}



}
