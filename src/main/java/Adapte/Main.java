package Adapte;

public class Main {
    public static void main(String[] args){
    Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(80f));
    adapter.twiceOf(100f);
    adapter.twiceOf(88f);

    }
}
