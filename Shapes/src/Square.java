
public class Square extends Rectangle{
	
	public Square(String name, int sides, int length, int width) {
		super(name, sides, length, width); //the super constructor initializes the variables using rectangle
		
		//checks if the object is actually a square. If it is not, the name is change to rectangle.
		if (length != width){
			this.name = "Rectangle";
		}	
	}
	
	//if the object is a rectangle, the Rectangle class's getPerimeter is used instead
	public double getPerimeter() {
			if(this.length != this.width) {
				super.getPerimeter();
			}
			perimeter = this.length *4;
			return perimeter;
	}
	
	//if the object is a rectangle, the Rectangle class's getArea is used instead
	public void getArea() {
		if(this.length != this.width) {
			super.getArea();
		}else {
			System.out.println("The area of a square is length * length");
			area = Math.pow(this.length, 2);
			System.out.println("The area is: " + area);
		}
	}
}
