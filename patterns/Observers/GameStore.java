public class GameStore implements Observer {
    String name;
    Game game;

    GameStore(String NewName, Game newGame) {
        this.game = newGame;
        this.name = NewName;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	@Override
	public void update(Game game) {
        System.out.println(this.getName() + " has updated " + this.game.getName() +" With a new price of " + game.getPrice());
        setGame(game);
	}

    
    
    
}