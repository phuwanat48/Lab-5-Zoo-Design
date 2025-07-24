package Lib;

public class Eagle extends Bird implements Flyable{
    public Eagle(String name){
        super(name);
    }


    @Override
    public String makesound() {
        return "Screech!";
    }
    
    @Override
    public String fly() {
        return ("The eagle soars through the sky");
        
    }


}
