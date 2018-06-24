import java.util.Comparator;

public class GameAdministration {

	private static Comparator<Game> getComparator() {
		return new CategoryComparator();
	}
}
