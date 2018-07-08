public aspect Update{
	
	pointcut updating() : execution(* GameAdministration.update(..));
	
	void around() : updating() {
		System.out.println("Enter the index at which you want to change something, if you don't enter -1");
		String indexString = GameAdministration.scanner.next();
		try {
			int index = Integer.parseInt(indexString);
			
			if(index == -1) return;
			
			if (index < 0 || index > (GameAdministration.games.length - 1)) {
				System.out.println("Wrong Index!");
				return;
			}
			
			System.out.println("Enter a game, seperated by ',', you can abort with typing abort");
			GameAdministration.scanner.useDelimiter(GameAdministration.getDelimiter());
			String gameString = GameAdministration.scanner.next();
			if (gameString.equals("abort")) {
				System.out.println("successfully aborted");
				return;
			}
			try {
				String[] gameStrings = gameString.split(",");
				for(String string: gameStrings) {
					if (string == null || string.equals("")) {
						System.out.println("Null is not an option.");
						return;
					}
				}
				
				if(gameStrings.length != 4) {
					System.out.println("To few or to many entries are not healthy...");
					return;
				}
				
				int rating = Integer.parseInt(gameStrings[3]);
				
				if(rating < 0 || rating > 100) {
					System.out.println("This does not work with such ratings...");
					return;
				}
				
				Game[] gamesTemp = new Game[GameAdministration.games.length - 1];
				int j = 0;
				for (int i = 0; i < GameAdministration.games.length; i++, j++) {
					if (i == index) {
						j = j - 1;
					} else {
						gamesTemp[j] = GameAdministration.games[i];
					}
				}
				GameAdministration.games = gamesTemp;
				
				gamesTemp = new Game[GameAdministration.games.length + 1];
				for (int i = 0; i < GameAdministration.games.length; i++) {
					gamesTemp[i] = GameAdministration.games[i];
				}
				gamesTemp[gamesTemp.length - 1] = new Game(gameStrings[0], gameStrings[1], gameStrings[2], rating);
				GameAdministration.games = gamesTemp;
			} catch (NumberFormatException e) {
				System.out.println("Not a number!");
			}
		} catch (NumberFormatException e) {
			System.out.println("Not a number!");
		}
	}
}