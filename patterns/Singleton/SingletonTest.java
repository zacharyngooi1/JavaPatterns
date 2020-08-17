
public class SingletonTest {
    public static void main(String[] args) {
        // The method to call the boject is a static method so that it can be used without isntantiating the class
        SingleOBJ.getOBJ().showMessage();
        // You are unable to instantiate the SingleOBJ class, e.g. SingleOBJ object = new SingleOBJ();
    }
}