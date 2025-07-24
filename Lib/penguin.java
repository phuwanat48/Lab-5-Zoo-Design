package Lib;

public class penguin extends Bird implements swimable{
    
    public penguin(String name) {
        super(name);
    }

 @Override
    public String makesound() {
        return "Squawk!";
    }
    

    @Override
    public String swim() {
        return("The penguin dives gracefully in the water.");
    }

    
}
