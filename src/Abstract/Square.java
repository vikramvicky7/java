package Abstract;

public class Square extends Shape {
	int side;

	public Square() {

	}

	public Square(String name, int side) {
		super(name);
		this.side = side;

	}

	public void findArea() {
		area = side * side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", name=" + name + ", area=" + area + "]";
	}

	public boolean equals(Object obj) {
		return (obj instanceof Shape && this.side == ((Square) obj).side) ? true : false;
	}

	public void printShape() {
		System.out.println("Side = " + side);
		super.printShape();
	}
}
