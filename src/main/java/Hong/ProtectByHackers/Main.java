package Hong.ProtectByHackers;

public class Main {
    public static void main(String[] args) {

        // 1. 계좌 생성
        Account myAccount = new Account(1000000);
        System.out.println(myAccount.toString());

        // 2. 계좌 해킹
        Hacker.malcious(myAccount);
        // 3. 결과 출력
        System.out.println(myAccount.toString());
    }
}

class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("Account {balance: %d }", balance);
    }
}

class Hacker {
    //클래스 메소드 - 계좌의 잔액을 0원으로 변경
    public static void malcious(Account account) {
        //파라미터 계좌의 잔액을 0으로 변경하시오
        account.balance = 0;
    }
}

/*

class  AAA{
    //필드
    private  String aaa; //비공개
    int bbb; //디폴트 공개
    protected double ccc; //상속 공개
    public boolean ddd; //완전 공개

    //메소드
    private void eee(){} //비공개
    int fff() {} //디폴트 공개
    protected double ggg(){} //상속 공개
    public boolean hhh(){} //비공개
}

*/
