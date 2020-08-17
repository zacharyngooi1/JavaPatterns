public class SingleOBJ {

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleOBJ(){}
    
    //create an object of SingleObject
    private static SingleOBJ singleobject = new SingleOBJ();
 
    //Get the only object available
    public static SingleOBJ getOBJ(){
       return singleobject;
    }
 
    public void showMessage(){
       System.out.println("This is the only way to call this message");
    }
 }