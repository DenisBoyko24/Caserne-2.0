package Caserne;

public class Knight implements Warrior {
    public void fight () {
        System.out.println("I'm a "+this.getClass().getSimpleName());
    }
}
