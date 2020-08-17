
class GenerateMeal{  
    public static void main(String args[]){  
        // Create a completeley new factory 
        GetPlanFactory fact = new GetPlanFactory();
        MealPlan white = fact.getMeal("white");
        MealPlan brown = fact.getMeal("brown");
    }
}