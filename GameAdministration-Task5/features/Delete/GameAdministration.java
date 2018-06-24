public class GameAdministration {

	private static void delete() {
		System.out.println("Enter the index at which you want to delete something, if you don't enter -1");
		String indexString = scanner.next();
		try {
			int index = Integer.parseInt(indexString);
			
			if(index == -1) return;
			
			if (index < 0 || index > (games.length - 1)) {
				System.out.println("Wrong Index!");
				return;
			}
			
			Game[] gamesTemp = new Game[games.length - 1];
			int j = 0;
			for (int i = 0; i < games.length; i++, j++) {
				if (i == index) {
					j = j - 1;
				} else {
					gamesTemp[j] = games[i];
				}
			}
			games = gamesTemp;
		} catch (NumberFormatException e) {
			System.out.println("Not a number!");
		}
	}
}
