package Hong.lec02.chap3;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.printf("이름 : %s\n", d.name);
        System.out.printf("품종 : %s\n", d.breeds);
        System.out.printf("나이  : %s\n", d.age);
    }
}

class Dog {
    //필드 영역
    String name;
    String breeds;
    int age; //무게


    //메소드 영역
    void wag() {
        System.out.println("샬랑샬랑");
    }

    void bark() {
        System.out.println("멍멍 왈왈");
    }
}

