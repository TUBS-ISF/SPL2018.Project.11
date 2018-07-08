import java.util.Comparator;

/**
 * 
 * @author Leon
 *
 */
public class CategoryComparator implements Comparator<Game> {

	public int compare(Game g1, Game g2) {
		return compare(g1.getCategory(), g2.getCategory());
	}

	public static int compare(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		int shorterTitle = (getShorterStringLength(s1, s2));

		for (int i = 0; i < shorterTitle; i++) {
			if (s1.charAt(i) > s2.charAt(i)) {
				return 1;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return -1;
			}
		}

		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int getShorterStringLength(String s1, String s2) {
		int length;
		if (s1.length() <= s2.length()) {
			length = s1.length();
		} else {
			length = s2.length();
		}
		return length;
	}
}
