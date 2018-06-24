import java.util.Comparator;

public class GameAdministration {

	private static void get() {
		Quicksort qs = new Quicksort();
		games = qs.sort(games, getComparator());
		
		System.out.println(Game.getHead());
		if (games.length == 0) return;
		for (int i = 0; i < games.length; i++) {
			System.out.println(games[i].toString());
		}
	}
}
