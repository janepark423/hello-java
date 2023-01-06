package core.sec02;

//public class EmployeeDemo {
//    public static void main(String[] args) {
//        Employee fred = new Employee("Fred", 50000);
//        fred.raiseSalary(5);
//        System.out.println(fred.getName());
//        System.out.println(fred.getSalary());
//    }
//}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee fred = new Employee("Fred", 50000);
        fred.raiseSalary(20);
        System.out.println(fred.getSalary());
        System.out.println(fred.getName());
    }
}