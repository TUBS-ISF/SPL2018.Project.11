import java.util.Comparator;
import java.util.Scanner;

public class GameAdministration {

	public static Game[] games = new Game[6];
	private static Scanner scanner = new Scanner(System.in);
	private static Comparator<Game> comparator;
	private static String delimiter;

	public static void main(String args[]) {
		init();
		//Scanner scanner = new Scanner(System.in);
		boolean keepalive = true;
		while (keepalive) {
			switch (scanner.next()) {
			case "get":
				get();
				break;
			case "add":
				add();
				break;
			case "delete":
				delete();
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

	private static void get() {	
		System.out.println("Feature not selected");
	}

	private static void save() {
		System.out.println("Feature not selected");
	}
	
	private static void add() {
		System.out.println("Feature not selected");
	}
	
	private static void delete() {
		System.out.println("Feature not selected");
	}
	
//	private static Comparator<Game> getComparator() {
//		return comparator;
//	}
	
//	private static String getDelimiter() {
//		return delimiter;
//	}
}
