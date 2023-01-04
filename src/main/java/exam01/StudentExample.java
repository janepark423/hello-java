package exam01;

public class StudentExample {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조");

        Student s2 = new Student();
        System.out.println("s2 변수가 Student 객체를 참조");

        if(s1 == s2){
            System.out.println("같은 객체를 참조");
        }else {
            System.out.println("다른 객체를 참조");
        }
    }
}
