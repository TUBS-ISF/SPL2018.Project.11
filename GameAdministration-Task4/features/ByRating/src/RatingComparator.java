import interfaces.IComparator;
import administration.Game;

/**
 * 
 * @author Leon
 *
 */
public class RatingComparator implements IComparator {

	public int compare(Game g1, Game g2) {
		if (g1.getRating() > g2.getRating()) {
			return 1;
		} else if (g1.getRating() < g2.getRating()) {
			return -1;
		} else {
			return 0;
		}
	}
}
