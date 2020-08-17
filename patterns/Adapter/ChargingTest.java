public class ChargingTest {
    public static void main(String[] args) {
        SamsungCharger samsungcharger = new SamsungCharger();
        samsungcharger.charge("samsung");
        samsungcharger.charge("apple");
        samsungcharger.charge("google");
    }
}