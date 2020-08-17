class GetPlanFactory{  
    MealPlan getMeal(String givenMeal) {
        MealPlan meal = null;
        switch(givenMeal.toLowerCase()) {
            case "white":
                meal = new WhiteRiceMeal();
                break;
            case "brown":
                meal = new BrownRiceMeal();
                break;
            default:
                System.out.println("No valid arg\n");
        }
        meal.addRice();
        meal.addMeat();
        meal.makeFood();
        return meal;
    }
}