import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import loader.PluginLoader;
import administration.Game;
import administration.Quicksort;
import interfaces.IComparator;
import interfaces.ISave;

/**
 * 
 * @author Leon
 *
 */
public class SaveAsTXT implements ISave{

	@Override
	public void save(Game[] games) {

		try {
			PrintWriter out = new PrintWriter("GameAdministrationSave.txt");
			List<IComparator> comparators = PluginLoader
					.load(IComparator.class);
			System.out.println(comparators.size());

			for (IComparator comparator : comparators) {
				Quicksort qs = new Quicksort();
				games = qs.sort(games, comparator);
				out.println("Title,Publisher,Category,Rating");
				for (int i = 0; i < games.length; i++) {
					out.println(games[i].toString());
				}
				out.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}

}
