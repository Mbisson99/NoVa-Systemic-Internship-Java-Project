
public abstract class Shape {
	String name; 
	int sides;
	double area;//area and perimeter variables are placed here so files that inherit from it can use them.
	double perimeter;
	
	//the constructor for shapes recieves the name and number of sides
	public Shape(String name, int sides) {
		this.name = name;
		this.sides = sides;
	}
	
	//prints out the name and number of sides
	public void getShape() {
		System.out.println("I am a " + this.name + " and I have " + this.sides + " sides.");
	}
	
	//the abstract methods
	abstract double getPerimeter();
	abstract void getArea();
}
