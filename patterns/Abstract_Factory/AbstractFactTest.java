public class AbstractFactTest {
    public static void main(String[] args) {
        // Create a master factory trhough the static method cause laziness
        MasterFactory roughFactory = MasterFactoryCreator.getMasterFactory("rough");
        // create rough chicken and rough tofu through the rough factory
        Meal roughChicken = roughFactory.getMeal("chicken");
        Meal roughTofu = roughFactory.getMeal("tofu");
        roughChicken.whichMeal();
        roughTofu.whichMeal();
        // create normal factory
        MasterFactory normalFactory = MasterFactoryCreator.getMasterFactory("smooth");
        // create normal meals throught he factory
        // Note the strings used are the same but the obj created are different
        Meal normalChicken = normalFactory.getMeal("chicken");
        Meal normalTofu = normalFactory.getMeal("tofu");
        normalChicken.whichMeal();
        normalTofu.whichMeal();
    }
    
}