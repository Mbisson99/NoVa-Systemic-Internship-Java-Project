
public class test{

	public static void main(String[] args) {
	
	//rectangle object
	Rectangle rec = new Rectangle("Rectangle", 4, 2, 4);
	//square object
	Square sq = new Square("Square", 4, 2, 2);
	//test for a square object that is not a square
	Square re = new Square("Square", 4, 2, 3);
	//circle object
	Circle cir = new Circle("Circle", 1, 5);
	//right triangle object
	RightTriangle riTri = new RightTriangle("Right Triangle", 3, 3 , 4);
	
	//test for the various getShapes
	rec.getShape();
	sq.getShape();
	re.getShape();
	cir.getShape();
	riTri.getShape();
	//test the perimeter method for right triangle
	System.out.println(riTri.getPerimeter());
	}
}