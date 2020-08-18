public class IteratorTest {
    public static void main(String[] args) {
        Bacon bacon1 = new Bacon("streaky bacon", 5);
        Bacon bacon2 = new Bacon("Fatty bacon", 4);
        Milk milk1 = new Milk("whole milk", 10);
        Milk milk2 = new Milk("Almond milk", 520);

        ShoppingKart kart = new ShoppingKart();

        kart.addGroceries(bacon1);
        kart.addGroceries(bacon2);
        kart.addGroceries(milk1);
        kart.addGroceries(milk2);

        for (Iterator iterator = kart.getIterator(); iterator.hasNext();) {
            // Cast type to item
            Grocery item = (Grocery)iterator.next();
            System.out.println("name is " + item.getName() + " with cost of " + item.getCost());
        }

    }
}