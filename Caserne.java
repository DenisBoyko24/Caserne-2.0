package Caserne;

public class Caserne {

    public static Warrior createWarrior (WarriorType type) {
        return (Warrior) Main.warType.get(type).apply(type);
    }
}
