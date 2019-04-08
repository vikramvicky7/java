package lists;


	
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.TreeSet;

	public class ArrList {
		public static void main(String[] args) {

			ArrayList l = new ArrayList();
			l.add(1);
			l.add(3);
			l.add(6);
			l.add(9);
			l.add("mark");
			System.out.println(l);

			l.add(2, 10);
			System.out.println(l);

			l.remove(4);
			System.out.println(l);

			ArrayList<String> names = new ArrayList<>();

			names.add("Ned Stark");
			names.add("Rob Stark");
			names.add("Jon Stark");

	        Iterator<String> i = names.iterator();

			while (i.hasNext()) {
				System.out.println(i.next());
			}


		}
}