public class Code011 {
//클래스 바깥에는 변수 선언 못함


    static int num;

    public static void main(String[] args){
//TODO: 함수 내부에서는 변수에 static 선언할 수 없음.

        int anotherNum = 5;
        num = 2;

        System.out.println(num + anotherNum);
        System.out.println("Num" + num);
        System.out.println("anotherNum" + anotherNum);
    }
}
