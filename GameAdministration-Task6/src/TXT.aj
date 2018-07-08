import java.io.FileNotFoundException;
import java.io.PrintWriter;

public aspect TXT {

	pointcut saving() : execution(* GameAdministration.save(..));
	
	void around() : saving() {
		try {
			PrintWriter out = new PrintWriter("GameAdministrationSave.txt");

			Quicksort qs = new Quicksort();
			GameAdministration.games = qs.sort(GameAdministration.games, GameAdministration.getComparator());
			out.println(Game.getHead());
			for (int i = 0; i < GameAdministration.games.length; i++) {
				out.println(GameAdministration.games[i].toString());
			}
			out.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}
}
