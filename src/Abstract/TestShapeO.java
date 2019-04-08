package Abstract;

public class TestShapeO {

	public static void main(String[] args) {
		Shape c1 = new Circle("Circle", 1.2f);
		Shape c2 = new Circle("Circle", 3.2f);
		c2.findArea();
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		Shape r1 = new Rectangle("Rectangle", 6, 4);
		Shape r2 = new Rectangle("Rectangle", 6, 8);
		r1.findArea();
		System.out.println(r1);
		System.out.println(r1.equals(r2));
		Shape s1 = new Square("Square", 2);
		Shape s2 = new Square("Square", 2);
		s1.findArea();
		System.out.println(s1);
		System.out.println(s1.equals(s1));
		System.out.println(s1.hashCode());
		s2.findArea();
	}

}
