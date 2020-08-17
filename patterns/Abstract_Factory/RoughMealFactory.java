public class RoughMealFactory extends MasterFactory{ 
    
    @Override
    public Meal getMeal(String mealType) {

        switch(mealType) {
            case "chicken":
                return new RoughChicken();
            case "tofu":
                return new RoughTofu();
            default:
                break;
        }
        return null;
    }
    
}