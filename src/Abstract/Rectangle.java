package Abstract;

public class Rectangle extends Shape {

	int length;
	int breadth;

	public Rectangle() {

	}

	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", name=" + name + ", area=" + area + "]";
	}

	public boolean equals(Object obj) {
		return (obj instanceof Shape && this.length == ((Rectangle) obj).length) ? true : false;
	}

	public void findArea() {
		area = length * breadth;
	}

	public void printShape() {
		System.out.println("length = " + length);
		System.out.println("breadth = " + breadth);
		super.printShape();
	}
}
