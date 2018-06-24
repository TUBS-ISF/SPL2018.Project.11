public class GameAdministration {

	private static void add() {
		System.out.println("Enter a game, seperated by ',', you can abort with typing abort");
		scanner.useDelimiter("\r\n");
		String gameString = scanner.next();
		if (gameString.equals("abort")) {
			System.out.println("successfully aborted");
			return;
		}
		try {
			String[] gameStrings = gameString.split(",");
			for(String string: gameStrings) {
				if (string == null) {
					System.out.println("Null is not an option.");
					return;
				}
			}
			
			if(gameStrings.length != 4) {
				System.out.println("To few or to many entries are not healthy...");
				return;
			}
			
			int rating = Integer.parseInt(gameStrings[3]);
			
			Game[] gamesTemp = new Game[games.length + 1];
			for (int i = 0; i < games.length; i++) {
				gamesTemp[i] = games[i];
			}
			gamesTemp[gamesTemp.length - 1] = new Game(gameStrings[0], gameStrings[1], gameStrings[2], rating);
			games = gamesTemp;
		} catch (NumberFormatException e) {
			System.out.println("Not a number!");
		}
	}
}
