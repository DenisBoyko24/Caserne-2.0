package Caserne;

public class Infantryman implements Warrior {
    public void fight () {
        System.out.println("I'm a "+this.getClass().getSimpleName());
    }
}
