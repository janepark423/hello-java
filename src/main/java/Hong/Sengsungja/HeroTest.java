package Hong.Sengsungja;

public class HeroTest {
    public static void main(String[] args) {
        Hero ironMan = new Hero("아이언", 80);
        Hero thanos = new Hero("타노스", 160);
        Hero thor = new Hero("토르", 150);
        Hero groot = new Hero("그루트", 40);

        System.out.println(ironMan.toStr());
        System.out.println(thanos.toStr());
        System.out.println(thor.toStr());
        System.out.println(groot.toStr());
    }
}

class Hero {
    String name;
    int hp;

    Hero(String name, int hp) {
        //파라미터 추가하기

        //필드값 초기화 하기
    }

    //메소드
    String toStr() {
        return String.format("Hero {name: %s, hp: %d}", name, hp);
    }
}
