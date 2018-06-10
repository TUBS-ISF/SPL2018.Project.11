import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GameAdministration {

	private static Game[] games = new Game[6];

	public static void main(String args[]) {
		init();
		Scanner scanner = new Scanner(System.in);
		boolean keepalive = true;
		while (keepalive) {
			switch (scanner.next()) {
			case "get":
				print();
				break;
			case "save":
				save();
				break;
			case "end":
				keepalive = false;
				break;
			}
		}
		scanner.close();
	}

	private static void init() {
		games[0] = (new Game("Dark Souls 3", "From Software", "RPG", 100));
		games[1] = (new Game("Dark Souls 2", "From Software", "RPG", 96));
		games[2] = (new Game("Dark Souls 1", "From Software", "RPG", 100));
		games[3] = (new Game("CSGO", "Valve Corporation", "FPS", 87));
		games[4] = (new Game("Warcraft 3", "Blizzard", "Strategy", 98));
		games[5] = (new Game("Overwatch", "Blizzard", "FPS", 97));
	}

	private static void print() {
		// #if Get
		// #if ByCategory
		// @
		// @ Quicksort qs = new Quicksort();
		// @ games = qs.sort(games, new CategoryComparator());
		// @
		// #endif
		// #if ByPublisher
		// @
		// @ Quicksort qs = new Quicksort();
		// @ games = qs.sort(games, new PublisherComparator());
		// @
		// #endif
		// #if ByTitle
//@
//@		Quicksort qs = new Quicksort();
//@		games = qs.sort(games, new TitleComparator());
//@
		// #endif
		// #if ByRating
		// @
		// @ Quicksort qs = new Quicksort();
		// @ games = qs.sort(games, new RatingComparator());
		// @
		// #endif
//@		games[0].printHead();
//@		for (int i = 0; i < games.length; i++) {
//@			games[i].print();
//@		}
		// #else
		 System.out.println("Feature not selected!");
		// #endif
	}

	private static void save() {
		// #if TXT
//@
//@		try {
//@			PrintWriter out = new PrintWriter("GameAdministrationSave.txt");
			// #if ByCategory
			// @
			// @ Quicksort qs = new Quicksort();
			// @ games = qs.sort(games, new CategoryComparator());
			// @
			// #endif
			// #if ByPublisher
			// @
			// @ Quicksort qs = new Quicksort();
			// @ games = qs.sort(games, new PublisherComparator());
			// @
			// #endif
			// #if ByTitle
//@
//@			Quicksort qs = new Quicksort();
//@			games = qs.sort(games, new TitleComparator());
//@
			// #endif
			// #if ByRating
			// @
			// @ Quicksort qs = new Quicksort();
			// @ games = qs.sort(games, new RatingComparator());
			// @
			// #endif
//@			out.println("Title,Publisher,Category,Rating");
//@			for (int i = 0; i < games.length; i++) {
//@				out.println(games[i].toString());
//@			}
//@			out.close();
//@		} catch (FileNotFoundException e) {
//@			System.out.println("File not found!");
//@			e.printStackTrace();
//@		}
		// #else
		 System.out.println("Feature not selected!");
		// #endif
	}
}
