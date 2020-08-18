public abstract class Grocery {
    private String name;
    private int cost;
    public Grocery(String newName, int Cost) {
        this.name =  newName;
        this.cost = Cost;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}