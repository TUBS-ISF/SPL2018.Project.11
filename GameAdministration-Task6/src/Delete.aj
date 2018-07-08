aspect Delete{
	
	pointcut deleting() : execution(* GameAdministration.delete(..));
	
	void around() : deleting() {
		System.out.println("Enter the index at which you want to delete something, if you don't enter -1");
		String indexString = GameAdministration.scanner.next();
		try {
			int index = Integer.parseInt(indexString);
			
			if(index == -1) return;
			
			if (index < 0 || index > (GameAdministration.games.length - 1)) {
				System.out.println("Wrong Index!");
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
		} catch (NumberFormatException e) {
			System.out.println("Not a number!");
		}
	}
}