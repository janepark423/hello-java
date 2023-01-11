package Hong.ProtectByHackers;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1000000);
        System.out.println(myAccount.toString());

        Hacker.malcious(myAccount);
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
    public static void malcious(Account account) {

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
