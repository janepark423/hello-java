package Hong.GetterNSetter;

public class LockTest {
    public static void main(String[] args) {
        Lock lock = new Lock("12312#@$@#");

        // lock.password = "654#%$54";
        lock.setPassword("654#%$54");
        System.out.println(lock.toString());
    }
}

class Lock {
    private String password;

    public Lock(String p) {
        password = p;
    }

    public String toString() {
        return String.format("Lock {password : %s}", password);
    }

    public void setPassword(String pw) {
        password = pw;
    }
}
