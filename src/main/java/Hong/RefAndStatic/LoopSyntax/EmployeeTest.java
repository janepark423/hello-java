package Hong.RefAndStatic.LoopSyntax;

public class EmployeeTest {
    public static void main(String[] args) {
        int[] hours0 = {2, 4, 3, 4, 5, 8, 8};
        int[] hours1 = {7, 3, 4, 3, 3, 4, 4};

        //객체 생성
        Employee e0 = new Employee("직원0", hours0);
        Employee e1 = new Employee("직원1", hours1);
        //객체 배열 만듦
        Employee[] employees = {e0, e1};
        //정보출력
        for (int i = 0; i < employees.length; i++) {
            employees[i].printTotalHours();
        }

    }
}

class Employee {
    String name;
    int[] hours; //요일별 일한 시간

    //생성자
    Employee(String str, int[] arr) {
        name = str;
        hours = arr;
    }

    void printTotalHours() {
        System.out.printf("%s -> %d 시간 \n", name, totalHours());
    }

    int totalHours() {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            sum += hours[i];
        }
        return sum;
    }
}