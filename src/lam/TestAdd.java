package lam;

public class TestAdd {
	
	public static void main(String[] args) {
		
		Add a=(x,y) -> System.out.println("sum =" + (x+y));
		a.add(16,15);
	}

}
