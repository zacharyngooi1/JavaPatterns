import java.util.ArrayList;

public class MarioKart implements Game {
    private String name;
    private int price;
    private ArrayList<Observer> observers;

    public MarioKart(String newName, int newPrice) {
        this.name = newName;
        this.price = newPrice;
        this.observers = new ArrayList<>();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
        this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
        this.price = price;
        update();
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void update() {
        for (Observer ob: observers) {
            ob.update(this);
        }
    }

}

