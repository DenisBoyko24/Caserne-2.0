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
/* 1. ����� Warrior ������ ����������� �������?
2. ���� ������� ������� � ���, ��� �� ������� ���� ������ ������� � �� (����) ������ ���� ������ �������. ��� ������
�������: ���� ���� ������� �� �� ������ �������� ������ �����.
3. � �����, ��� ������� ����� �������� �������, �� ���� �� ����� ��������� ��������, ��, ����� ����, ��������� �����
���������� ����� ����������� �����, � �� ����� ���������.
4. ���������� ArmyTraining ����� ��������, ������� ���������� ����, ������� � ������ ����� ����� WarriorType,
� �������� �������� ����� �������������� ���������, ��������� � ������� �� enum � ���������� - ���������� ��������
������� ����. ����� createWarrior � ���������� ����� ��������� �� �� �����, � � ���������� ������ ����� ��������
�� ����� ������ ���������� �� ���������� ���� � �������� � �� ����� apply.
*/