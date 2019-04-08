package Abstract;

public class TestShape {

	public static void main(String[] args) {
		Shape c = new Circle("Circle", 23.5f);
		c.findArea();
		c.printShape();
		Shape c1 = new Square("Square", 10);
		c1.findArea();
		c1.printShape();
		Shape c2 = new Rectangle("Rectangle", 5, 6);
		c2.findArea();
		c2.printShape();

	}

}
