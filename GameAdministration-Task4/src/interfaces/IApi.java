package interfaces;

import administration.Game;

public interface IApi {

	// crud = "create read update delete"
	public Game[] crud(Game[] games, String operationName);
}
