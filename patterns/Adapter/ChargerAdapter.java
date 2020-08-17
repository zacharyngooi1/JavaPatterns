public class ChargerAdapter implements Charger {

    UniversalCharger universalCharge;
    // Create the relevant concrete classes
    public ChargerAdapter(String phoneType) {
        switch(phoneType) {
            case "apple":
                universalCharge = new AppleCharge();
                break;
            case "google":
                universalCharge = new GoogleCharge();
                break;
            default:
                break;
        }
    }

    @Override
    public void charge(String phoneType) {
        if (phoneType == "apple") {
            universalCharge.chargeApple(phoneType);
        }
        else if (phoneType == "google") {
            universalCharge.chargeGoogle(phoneType);
        }
    }
    
}