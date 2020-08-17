import java.util.ArrayList;

public class ShoppingKart implements GroceryInterface{

    private ArrayList<GroceryInterface> shoppingKart = new ArrayList<>();

    public void addToKart(GroceryInterface grocery) {
        this.shoppingKart.add(grocery);
    }


    @Override
    public void accept(ShoppingKartVisitor visitor) {
       for (GroceryInterface grocery: shoppingKart) {
           grocery.accept(visitor);
       }
       visitor.visit(this);
    }
    
}