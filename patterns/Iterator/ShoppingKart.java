
import java.util.ArrayList;

public class ShoppingKart implements Container {
    public ArrayList<Grocery> groceries;
    
    public ShoppingKart() {
        groceries = new ArrayList<>();
    }

    @Override
    public Iterator getIterator() {
        GroceryIterator iter = new GroceryIterator();
        iter.setKart(this);
       return iter;
    }

	public ArrayList<Grocery> getGroceries() {
		return groceries;
	}

	public void addGroceries(Grocery grocery) {
		this.groceries.add(grocery);
	}


 }