
public class Rectangle extends Shape{
	int length;
	int width;
	
	public Rectangle(String name, int sides, int length, int width) {
		super(name, sides); //super constructor initializes the name and sides
		this.length = length;
		this.width = width;
	}
	
	public double getPerimeter() {
		perimeter = (this.length*2) + (this.width *2);
		return perimeter;
	}
	
	//calculates and prints the area of the rectangle
	public void getArea() {
		System.out.println("The area of a rectangle is length * width");
		area = this.length * this.width;
		System.out.println("The area is: "+ area);
	}
}
