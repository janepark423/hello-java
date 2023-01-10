package Hong.lec02.chap3.anotherObj;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();

        b1.name = "할리데이비슨 바이크";
        b1.weight = 7.25;
        b1.price = 256000;
    }
}

class Bicycle {
    String name;
    double weight;
    int price;

    void move() {
        System.out.println("자전거 타고 이동듕");
    }

    void horn() {
        System.out.println("띠로링 지나갈게여");
    }
}