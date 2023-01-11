package Hong.GetterNSetter;

public class PersonTest {
    public static void main(String[] args) {

        Person park = new Person("쟈인", "010-xxxx-xxxx");
        //게터를 호출하여 필드값을 얻으시오
        System.out.printf("이름 : %s\n", park.name);
        System.out.printf("dusfkrcj : %s\n", park.phoneNumber);
    }
}

class Person {
    private String name;
    private String phoneNumber;

    public Person(String n, String p) {
        name = n;
        phoneNumber = p;
    }
    //게터를 추가하시오
}
