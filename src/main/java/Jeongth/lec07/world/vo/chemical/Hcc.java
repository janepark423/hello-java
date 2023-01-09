package Jeongth.lec07.world.vo.chemical;

//한화 솔루션 케미칼
public class Hcc {
    private static Hcc hcc = new Hcc();

    private Hcc() {

    }

    public static Hcc getInstance() {
        return hcc;
    }
}
