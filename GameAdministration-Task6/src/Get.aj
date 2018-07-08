public aspect Get {

	pointcut getting() : execution(* GameAdministration.get(..));
	
	void around() : getting() {
		Quicksort qs = new Quicksort();
		GameAdministration.games = qs.sort(GameAdministration.games, GameAdministration.getComparator());

		System.out.println(Game.getHead());
		if (GameAdministration.games.length == 0)
			return;
		for (int i = 0; i < GameAdministration.games.length; i++) {
			System.out.println(GameAdministration.games[i].toString());
		}
	}
}