
import Lib.*;
import java.util.ArrayList;


public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Eagle("Eagle"));
        animals.add(new penguin("Penguin"));
        animals.add(new Dolphin("Dolphin"));

        System.out.println("----sounds----");

        for (Animal animal : animals){
            System.out.println(animal.getName()+": says "+animal.makesound());
    }

        System.err.println("----ability----");

    for (Animal animal : animals){
        if(animal instanceof Flyable){
            System.out.println(animal.getName()+": can fly "+ ((Flyable) animal).fly());
        }else if (animal instanceof swimable){
            System.out.println(animal.getName()+": can swim "+ ((swimable) animal).swim());
        }else {
            System.out.println(animal.getName()+": is Walking ");
        }
    }



}
}
