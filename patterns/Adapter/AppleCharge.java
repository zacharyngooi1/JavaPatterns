public class AppleCharge implements UniversalCharger {
    @Override
    public void chargeApple(String phonetype) {
        System.out.println("Charging " + phonetype + " phone");
    }    

    @Override
    public void chargeGoogle(String phonetype) {
        // does nothing as it cant charge a google phone
    }

    
}