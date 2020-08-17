public class MealFactory extends MasterFactory {
    @Override
    public Meal getMeal(String mealType) {

        switch(mealType) {
            case "chicken":
                return new Chicken();
            case "tofu":
                return new Tofu();
            default:
                break;
        }
        return null;
    }
}