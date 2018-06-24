import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;

public class GameAdministration {

	private static void save() {

		try {
			PrintWriter out = new PrintWriter("GameAdministrationSave.txt");

			Quicksort qs = new Quicksort();
			games = qs.sort(games, getComparator());
			out.println(Game.getHead());
			for (int i = 0; i < games.length; i++) {
				out.println(games[i].toString());
			}
			out.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}
}
