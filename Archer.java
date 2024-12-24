package Caserne;

public class Archer implements Warrior {
    public void fight () {
        System.out.println("I'm a "+this.getClass().getSimpleName());
    }
}
