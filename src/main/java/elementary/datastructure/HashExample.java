package elementary.datastructure;

public class HashExample {

	public static int stringHash(String str, int modulus) {
		int kMult = 997;
		int val = 0;
		for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      val = (val * kMult + c) % modulus;
		}

		return val;
	}
}
