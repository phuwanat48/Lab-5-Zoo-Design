package Lib;


public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String makesound() {
        return "Mammal sound";
    }
}

