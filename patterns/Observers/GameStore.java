public class GameStore implements Observer {
    String name;
    Game game;
    int gameprice;

    GameStore(String NewName, Game newGame) {
        this.name = NewName;
        this.game = newGame;
        this.gameprice = newGame.getPrice();
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
        setGame(game);
        this.gameprice = game.getPrice();
        System.out.println(this.getName() + " has updated " + this.game.getName() +" With a new price of " + this.getGameprice());
    }

	public int getGameprice() {
		return gameprice;
	}

	public void setGameprice(int gameprice) {
		this.gameprice = gameprice;
	}

    
    
    
}