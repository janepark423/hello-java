package Hong.RefAndStatic;

public class Medic {
    String name;
    int hp;
    int mp;

    Medic(String s, int i1, int i2) {
        name = s;
        hp = i1;
        mp = i2;
    }

    void heal(Marine target) {
        System.out.printf("[%s]의 치유 =>", name);
        System.out.printf("[%s] HP(%d -> 치유 =>", target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d)\n", target.hp);
    }
}
