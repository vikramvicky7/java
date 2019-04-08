package Arrays;

public class ObjectCount {
	int id;
	String name;
	static int count = 0;

	public ObjectCount() {
		count++;
	}

	public ObjectCount(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		count++;
	}

	public void pCount() {
		System.out.println(" id = " + id);
		System.out.println(" name = " + name);

		System.out.println(" number of objects = " + count);
	}
}
