public class MasterFactoryCreator {
    
    public static MasterFactory getMasterFactory(String rough) {
        switch(rough) {
            case "rough":
                return new RoughMealFactory();
            case "smooth":
                return new MealFactory();
        }
        return null;
    }
}