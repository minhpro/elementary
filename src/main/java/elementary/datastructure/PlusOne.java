package elementary.datastructure;

import java.util.List;

public class PlusOne {

	public static List<Integer> plusOne(List<Integer> xs) {
		if (xs.isEmpty()) {
			return xs;
		}
		int n = xs.size() - 1;
		xs.set(n, xs.get(n) + 1);
		for (int i = n; i > 0 && xs.get(i) == 10; --i) {
			xs.set(i, 0);
			xs.set(i - 1, xs.get(i - 1) + 1);
		}
		if (xs.get(0) == 10) {
			// Need additional digit as the most significant digit (i.e A.get(9))
			// has a carry-out .
			xs.set(0, 0);
			xs.add(0, 1);
		}
		return xs;
	}
}
