public class ShoppingKartVisitor implements VisitorInterface {

    private int totalBill = 0;

	@Override
	public void visit(Eggs eggs) {
		totalBill += eggs.getPrice() / 10;
	}

	@Override
	public void visit(Bacon bacon) {
        totalBill += bacon.getPrice() / 5;
	}

	@Override
	public void visit(Milk milk) {
        totalBill += milk.getPrice() / 2;
    }

	@Override
	public void visit(ShoppingKart kart) {
        System.out.println("Visiting shopping kart...");
    }
    
    public void getBill() {
        System.out.println("total bill is " + this.totalBill);        
    }
    
}