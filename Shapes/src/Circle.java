
public class Circle extends Shape{
	double radius;
	
	//uses super to initializes the name and sides with the Shape class.
	public Circle(String name, int sides, double radius) {
		super(name, sides);
		this.radius = radius;
	}
	
	//calculates the circumference
	public double getPerimeter() {
		perimeter = 2 * Math.PI * this.radius;
		return perimeter;
	}
	
	//calculates the area of the circle and prints it out.
	public void getArea() {
		System.out.println("The area of a circle is PI * Radius^2");
		area = Math.PI * Math.pow(this.radius, 2);
		System.out.println("The area is: " + area);
	}
}
