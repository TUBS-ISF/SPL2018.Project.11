import java.util.Comparator;


public class TitleComparator implements Comparator<Game>{

	@Override
	public int compare(Game g1, Game g2) {
		String title1 = g1.getTitle().toLowerCase();
		String title2 = g2.getTitle().toLowerCase();
		
		int shorterTitle = (getShorterStringLength(title1, title2));
		
		for(int i = 0; i < shorterTitle; i++) {
			if(title1.charAt(i) > title2.charAt(i)) {
				return 1;
			} else if (title1.charAt(i) < title2.charAt(i)) {
				return -1;
			}
		}
		
		if (title1.length() < title2.length()) {
			return -1;
		} else if (title1.length() > title2.length()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	private int getShorterStringLength(String s1, String s2) {
		int length;
		if(s1.length() <= s2.length()) {
			length = s1.length();
		} else {
			length = s2.length();
		}
		return length;
	}

}
