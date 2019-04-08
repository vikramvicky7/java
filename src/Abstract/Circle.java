package Abstract;

public class Circle extends Shape {

	float radius;

	public Circle() {

	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	public void findArea() {
		area = 3.14f * radius * radius;
	}
	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", name=" + name + ", area=" + area + "]";
	}

	public boolean equals(Object obj) {
		return (obj instanceof Shape && this.name == ((Circle) obj).name && this.radius == ((Circle) obj).radius) ? true
				: false;
	}

	public void printShape() {
		System.out.println("Radius = " + radius);
		super.printShape();
	}
}
