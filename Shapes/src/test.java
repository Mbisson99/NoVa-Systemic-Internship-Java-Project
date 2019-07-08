
public class test{

	public static void main(String[] args) {
	
	//rectangle object is created
	Rectangle rec = new Rectangle("Rectangle", 4, 2, 4);
		
	//square object is created
	Square sq = new Square("Square", 4, 2, 2);
		
	//test for a square object that is not a square
	Square faker = new Square("Square", 4, 2, 3);
		
	//circle object is created
	Circle cir = new Circle("Circle", 1, 5);
		
	//right triangle object is created
	RightTriangle riTri = new RightTriangle("Right Triangle", 3, 3 , 4);
	
	//test for the various getShapes
	rec.getShape();
	sq.getShape();
	faker.getShape();
	cir.getShape();
	riTri.getShape();
	
	//test the perimeter method for the shapes
	System.out.printf("%nThe perimeter of the " + rec.name +" is: " + rec.getPerimeter()+"%n");
	System.out.println("The perimeter of the " + sq.name + " is: " + sq.getPerimeter());
	System.out.println("The perimeter of the " + faker.name + " is: " + faker.getPerimeter());
	System.out.println("The perimeter of the " + cir.name + " is: " + cir.getPerimeter());
	System.out.printf("The perimeter of the " + riTri.name + " is: "+ riTri.getPerimeter() + "%n%n");
	
	//test the area method for the shapes
	rec.getArea();
	sq.getArea();
	faker.getArea();
	cir.getArea();
	riTri.getArea();
	}
}
