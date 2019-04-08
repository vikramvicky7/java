package Abstract;

public abstract class Shape {
	String name;
	float area;

	public Shape() {

	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + ", area=" + area + "]";
	}

	public boolean equals(Object obj) {
		return (obj instanceof Shape && this.name == ((Shape) obj).name) ? true : false;
	}

	public abstract void findArea();

	public void printShape() {
		System.out.println("Name = " + name);
		System.out.println("Area = " + area);
	}
}