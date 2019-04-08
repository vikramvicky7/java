package Arrays;

public class Overloading {

	public void findArea(float r) {
		System.out.println("area of a circle =" + 3.14f * r * r);
	}

	static{
		System.out.println("init vikram");
	}
	{
		System.out.println("constructor");
	}

	public void findArea(int s) {
		System.out.println("area of square =" + s * s);
	}

	public void findSum(int... nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("Sum=" + sum);
	}
}
