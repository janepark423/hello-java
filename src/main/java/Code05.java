public class Code05 {
/*
TODO: 배열의 선언

1. 데이터형 배열변수명[];
2.  데이터형[]
3. 배열 변수명;

TODO: 배얄의 메모리 할당

배열이름 = new 데이터형 [배열의 실제크기];

 */
    public  static  void  main(String[] args){

        int [] grades;
        grades = new int[5];

        double [] array;
        array = new double [100];

        char [] word  = new char [20];

        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 92;
        grades[3] = 95;
        grades[4] = 14;

//        for(int i =0; i< grades.length; i++){
//        System.out.println("Grade "+ (i+1) + ":   " + grades[i]);
//
//        }
        int i =0;
            while(i<grades.length){
                System.out.println("Grade "+ (i+1) + ":   " + grades[i]);
                i++;
            }
    }
}
