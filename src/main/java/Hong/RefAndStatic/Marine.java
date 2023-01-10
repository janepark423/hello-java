package Hong.RefAndStatic;

public class Marine {
    String name;
    int hp;

    Marine(String s, int i) {
        name = s;
        hp = i;
    }

    void stimpack() {
        System.out.printf("[%s]의 스팀팩 공격! HP: %d ->", name, hp);
        hp -= 10;
        System.out.printf("%d\n", hp);
    }
}
