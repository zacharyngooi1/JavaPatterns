public abstract interface Game {
    public abstract void attach(Observer obs);
    public abstract void detach(Observer obs);
    public abstract void update();
    public abstract void setPrice(int price);
    public abstract void setName(String name);    
    public abstract int getPrice();
    public abstract String getName();
}