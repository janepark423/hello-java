package Jeongth.lec05;

public class SamsungElectronics extends  Electronics{
    //Electronics를 상속 받는 중
    int productsCount = 0;

    public  void showCount(){
        System.out.println("show value :::" + productsCount);
        System.out.println("super.show value :::" + super.productsCount);
    }
}
