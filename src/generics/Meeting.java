package generics;

public class Meeting<T extends Employee> {
	private T head;

	public Meeting(T head) {
		this.head = head;
	}

	public T getHead() {
		return head;
	}

	public void setHead(T head) {
		this.head = head;
	}

	public void printH() {
		System.out.println("the head of the meeting = " +head.getClass().getSimpleName());
	}

}
