package Hong.VariableNMethod;

public class FishBreadTest {
    public static void main(String[] args) {
        FishBread[] breads = new FishBread[4];

        breads[0] = new FishBread(0);
        breads[1] = new FishBread(1);

        for (int i = 0; i < FishBread.count; i++) {
            breads[i].print();

        }
        System.out.println("======");
        //전체 붕어빵 객체 수를 출력하세욥
        System.out.printf("붕어빵 객체 수 : %d", FishBread.count);
    }
}

class FishBread {
    static int count; //붕어빵 객체 수
    String contents;

    public FishBread(int n) {
        //내용물 선택
        String[] arr = {"팥", "고구마", "치즈", "슈크림"};
        contents = arr[n];

        //붕어빵 객체 수 카운팅
        FishBread.count++;
    }

    //메소드
    void print() {
        System.out.printf("[%s] 붕어빵\n", contents);
    }
}
