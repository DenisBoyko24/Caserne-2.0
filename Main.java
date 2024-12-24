package Caserne;

import java.util.HashMap;
import java.util.function.Function;

public class Main {

    static HashMap<WarriorType, Function> warType = new HashMap<>();

    public static void main(String[] args) {
        Function <WarriorType, Warrior> newArcher = warriorType -> new Archer();
        Function <WarriorType, Warrior> newFalconer = warriorType -> new Falconer();
        Function <WarriorType, Warrior> newKnight = warriorType -> new Knight();
        Function <WarriorType, Warrior> newInfantryman = warriorType -> new Infantryman();
        warType.put(WarriorType.archer, newArcher);
        warType.put(WarriorType.falconer, newFalconer);
        warType.put(WarriorType.knight, newKnight);
        warType.put(WarriorType.infantryman, newInfantryman);

        Caserne.createWarrior(WarriorType.archer).fight();
        Caserne.createWarrior(WarriorType.knight).fight();
    }
}
/* 1. Зачем Warrior сделал абстрактным классом?
2. Идея фабрики состоит в том, что ты создаёшь один объект фабрики и он (один) шлёпает тебе нужные объекты. Для нашего
примера: есть одна казарма из неё должны выходить нужные войны.
3. Я думал, что казарма будет реальным классом, но если ты хотел прописать контракт, то, опять таки, непонятен смысл
реализации через абстрактный класс, а не через интерфейс.
4. Реализацию ArmyTraining можно изменить, добавив глобальную мапу, которая в ключах будет иметь WarriorType,
в качестве значения будет функциональный интерфейс, заполнить её ключами из enum и значениями - созданиями объектов
нужного типа. Метод createWarrior в параметрах будет принимать то же самое, а в реализации просто будет получать
по ключу нужную реализацию из глобальной мапы и вызывать у неё метод apply.
*/