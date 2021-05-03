package Concrete;

import Abstract.GameService;
import Entities.Concrete.Game;

public class GameManager implements GameService {

	@Override
	public void add(final Game game) {
		System.out.println(game.getName() + " isimli oyun eklendi.");
	}

	@Override
	public void delete(final Game game) {
		System.out.println(game.getName() + " isimli oyun eklendi.");
	}

	@Override
	public void update(final Game game) {
		System.out.println(game.getName() + " isimli oyun eklendi.");
	}

}