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

    //생성자 - 객체 생성 및 초기화
    Cat2(String s, double d, int i) {
        name = s; //이름 초기화
        weight = d; //무게 초기화
        age = i;//나이 초기화
    }

    void claw() {
        System.out.println("Cat2 할퀴기 기술 슥샥 슥샥");
    }

    void meow() {
        System.out.println(" Cat2 냐오옹..ㅡㅡ..");
    }
}