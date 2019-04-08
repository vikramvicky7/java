package wrappers;

public class Wrapper {
	
	public static void main(String[] args) {

		int i = 10;
		Integer j = new Integer(i);
		System.out.println("Integer i ="+i);

		i = j.intValue();
		i++;
		j = Integer.valueOf(i);
		System.out.println("Integer j ="+j);
		
	}

}
