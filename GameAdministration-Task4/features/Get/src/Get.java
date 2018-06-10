import interfaces.IApi;
import interfaces.IComparator;

import java.util.List;

import loader.PluginLoader;
import administration.Game;
import administration.Quicksort;

/**
 * 
 * @author Leon
 *
 */
public class Get implements IApi {

	@Override
	public Game[] crud(Game[] games, String operationName) {
		if (!operationName.equals("get")) {
			return null;
		}
		List<IComparator> comparators = PluginLoader.load(IComparator.class);
		System.out.println(comparators.size());

		for (IComparator comparator : comparators) {
			Quicksort qs = new Quicksort();
			games = qs.sort(games, comparator);
			games[0].printHead();
			for (int i = 0; i < games.length; i++) {
				games[i].print();
			}
		}
		return games;
	}

}
