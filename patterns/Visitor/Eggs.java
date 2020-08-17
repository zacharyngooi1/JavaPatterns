public class Eggs implements GroceryInterface{
    private int price;
    
    public Eggs() {
        this.price = 20;
    }

    // You want to implement a accept method where the visitor visits and takes classes values
    @Override
    public void accept(ShoppingKartVisitor visitor) {
        visitor.visit(this);
    }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}