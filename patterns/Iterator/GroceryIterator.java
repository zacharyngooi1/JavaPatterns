public class GroceryIterator implements Iterator {
    int index;
    ShoppingKart kart;

    public GroceryIterator() {
    }

    public void setKart(ShoppingKart kart) {
        this.kart = kart;
    }


      @Override
      public boolean hasNext() {
      
         if(index < kart.getGroceries().size()){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return kart.getGroceries().get(index ++);
         }
         return null;
      }		
}
