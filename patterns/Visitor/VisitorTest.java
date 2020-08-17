public class VisitorTest {
    public static void main(String[] args) {
        ShoppingKart kart = new ShoppingKart();
        Eggs eggs = new Eggs();
        Bacon bacon = new Bacon();
        Milk milk = new Milk();
        kart.addToKart(eggs);
        kart.addToKart(bacon);
        kart.addToKart(milk);
        kart.addToKart(bacon);
        ShoppingKartVisitor cashier = new ShoppingKartVisitor();
        // Once accepted, the cashier(visitor) will calculate each price according to the logic in each visit method
        kart.accept(cashier);
        cashier.getBill();
    }
}