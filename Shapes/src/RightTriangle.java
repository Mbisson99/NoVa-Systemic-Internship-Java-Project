
public class RightTriangle extends Shape{

	double sideA;
	double sideB;
	double sideC;
	//uses super to initialize name and side.
	public RightTriangle(String name, int sides, double sideA, double sideB) {
		super(name, sides);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	//uses Pythagoreans Theorem to calculate the third side of the triangle then calculates the perimeter.
	public double getPerimeter() {
		this.sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
		perimeter = this.sideA + this.sideB + this.sideC;
		return perimeter;
	}

	//calculates the area using sideA and sideB.
	public void getArea() {
		System.out.println("Area of a Right Triangle is height (sideA) * (base (sideB)/2");
		area = this.sideA * (this.sideB/2);
		System.out.println("The area is: " + area);
	}
}
