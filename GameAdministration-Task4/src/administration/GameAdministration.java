package administration;

import interfaces.IApi;
import interfaces.IComparator;
import interfaces.ISave;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import loader.PluginLoader;

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
		List<IApi> operations = PluginLoader.load(IApi.class);
		for (IApi operation : operations) {
			operation.crud(games, "get");
		}
		if (operations.size() == 0) {
			System.out.println("Feature not selected!");
		}

		/*List<IComparator> comparators = PluginLoader.load(IComparator.class);

		for (IComparator comparator : comparators) {
			Quicksort qs = new Quicksort();
			games = qs.sort(games, comparator);
			games[0].printHead();
			for (int i = 0; i < games.length; i++) {
				games[i].print();
			}
		}

		if (comparators.size() == 0) {
			System.out.println("Feature not selected!");
		}*/
	}

	private static void save() {
		List<ISave> savers = PluginLoader.load(ISave.class);
		for (ISave save : savers) {
			save.save(games);
		}

		if (savers.size() == 0) {
			System.out.println("Feature not selected!");
		}
	}
}
