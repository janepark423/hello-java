package Hong.RefAndStatic.lec02;

/*
✈클래스 메소드
클래스가 동작시키는 메소드
=>간편 기능 구현에 유용
=> Math.random();

✈인스턴스 메소드
"주 객체"가 동작하는 메소드
=>특정 객체의 동작 구현 시 유리
=>ma.stimpack();
 */
public class Student {
    //👇클래스(공유) 변수
    static int count = 0;

    //👇인스턴스(멤버) 변수
    int id;
    String name;
}
