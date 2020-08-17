public class SamsungCharger implements Charger{

    ChargerAdapter adapter;

	@Override
	public void charge(String phoneType) {
		switch(phoneType) {
            // By default samsung can charge samsung phones
            case "samsung":
                System.out.println("Charging samsung");
                break;
                // Create a new adapter and call the charge
            case "apple":
                adapter = new ChargerAdapter(phoneType);
                adapter.charge(phoneType);
                break;
            case "google":
                adapter = new ChargerAdapter(phoneType);
                adapter.charge(phoneType);
                break;
            default:
            break;
        }
		
	}    

    
}