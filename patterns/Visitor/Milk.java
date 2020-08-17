public class Milk implements GroceryInterface {
    private int price;
    
    public Milk() {
        this.price = 5;
    }
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public void accept(ShoppingKartVisitor visitor) {
        visitor.visit(this);
	}

    
}