//#if ByRating
import java.util.Comparator;

public class RatingComparator implements Comparator<Game>{

	@Override
	public int compare(Game g1, Game g2) {
		if(g1.getRating() > g2.getRating()) {
			return 1;
		} else if(g1.getRating() < g2.getRating()) {
			return -1;
		} else {
			return 0;
		}
	}
}
//#endif
