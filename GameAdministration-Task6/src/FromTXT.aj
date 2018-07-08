import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public aspect FromTXT {

	pointcut loading() : execution(* GameAdministration.load(..));

	void around() : loading() {
		// Scanner out = null;
		Game[] failsave = GameAdministration.games.clone();
		try {
			Scanner out = new Scanner(new File("GameAdministrationSave.txt"));
			Quicksort qs = new Quicksort();
			GameAdministration.games = qs.sort(GameAdministration.games, GameAdministration.getComparator());

			GameAdministration.games = new Game[0];

			while (out.hasNextLine()) {
				String line = out.nextLine();

				if (line.equals(Game.getHead())) {
					// Ignore Header
				} else {
					try {
						String[] gameStrings = line.split(",");
						for (String string : gameStrings) {
							if (string == null || string.equals("")) {
								System.out.println("Null is not an option.");
								throw new Exception();
							}
						}

						if (gameStrings.length != 4) {
							System.out.println("To few or to many entries are not healthy...");
							throw new Exception();
						}

						int rating = Integer.parseInt(gameStrings[3]);

						if (rating < 0 || rating > 100) {
							System.out.println("This does not work with such ratings...");
							throw new Exception();
						}

						Game[] gamesTemp = new Game[GameAdministration.games.length + 1];
						for (int i = 0; i < GameAdministration.games.length; i++) {
							gamesTemp[i] = GameAdministration.games[i];
						}
						gamesTemp[gamesTemp.length - 1] = new Game(gameStrings[0], gameStrings[1], gameStrings[2],
								rating);
						GameAdministration.games = gamesTemp;
					} catch (Exception e) {
						System.out.println("Something went terribly wrong!");
						GameAdministration.games = failsave;
						out.close();
						return;
					}
				}
			}
			out.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			//e.printStackTrace();
			GameAdministration.games = failsave;
		}
	}
}