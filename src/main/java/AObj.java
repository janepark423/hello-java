public class AObj {

    Ainterface ainterface;

    public AObj(){
        ainterface = new AinterfaceImpl();
    }

    public void funcAA(){
        //TODO: 델리게이트 (위임하다, 떠넘기다)
//TODO: 델리게이트: 다른 객체의 기능을 빌려서 사용하는 것.
        ainterface.funcA();
        ainterface.funcA();
       // System.out.println("AAAAA 따블");
       // System.out.println("AAAAA 따블");
    }
}
