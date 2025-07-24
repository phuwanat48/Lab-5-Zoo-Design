package Lib;

public class Dolphin extends Mammal implements swimable{

    public Dolphin(String name) {
        super(name);
        
    }


     @Override
    public String makesound() {
        return "Clicking sounds";
    }
    
    @Override
    public String swim() {
        return("The dolphin playfully swims in the sea.");
    }
    
}
