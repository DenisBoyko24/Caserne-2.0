package Caserne;

public class Falconer implements Warrior {
    public void fight () {
        System.out.println("I'm a "+this.getClass().getSimpleName());
    }
}
