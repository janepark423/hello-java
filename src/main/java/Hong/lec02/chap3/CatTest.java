package Hong.lec02.chap3;

public class CatTest {
    public static void main(String[] args) {
        Cat2 c = new Cat2();

        c.name = "핑꾸";
        c.breeds = "페르시안";
        c.age = 3;
        c.meow(); //인스턴스 메소드 호출
        
        System.out.printf("이름 : %s\n", c.name);
        System.out.printf("품종 : %s\n", c.breeds);
        System.out.printf("나이  : %s\n", c.age);
    }
}

class Cat2 {
    String name;
    String breeds;
    int age;

    void claw() {
        System.out.println("Cat2 할퀴기 기술");
    }

    void meow() {
        System.out.println(" Cat2 냐오옹..ㅡㅡ..");
    }
}