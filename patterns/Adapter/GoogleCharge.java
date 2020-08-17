public class GoogleCharge implements UniversalCharger {
    @Override
    public void chargeApple(String phonetype) {
    }    

    @Override
    public void chargeGoogle(String phonetype) {
        System.out.println("Charging " + phonetype + " phone");
    }
    
}