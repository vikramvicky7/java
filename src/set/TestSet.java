package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(9);
		hs.add(11);
		hs.add(89);
		hs.add(13);

		System.out.println(hs);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(11);
		lhs.add(9);
		lhs.add(5);
		lhs.add(13);
		lhs.add(89);

		System.out.println(lhs);

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(9);
		ts.add(29);
		ts.add(19);
		ts.add(49);
		ts.add(39);

		System.out.println(ts);
	}

}
