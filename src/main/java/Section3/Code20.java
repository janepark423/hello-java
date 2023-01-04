package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20
{
    static String [] name = new String[1000];
    static String [] number = new String[1000];
    static int n = 0;

    public static void main(String[] args) {
        try{
            Scanner inFile = new Scanner(new File("input.txt"));
            while(inFile.hasNext()){
                name[n]=inFile.next();
                number[n]=inFile.next();
                n++;
            }
            inFile.close();
        }catch ( FileNotFoundException e){
            System.out.println("파일 업뜸");
            System.exit(9);

        }
        bubbleSort();

        for (int i=0; i<n; i++)
            System.out.println(name[i] + ":" + number[i]);

    }
    static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    //TODO: 이름 부분 정렬을 바꾼다.

                    String tmp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tmp;

                    // //TODO: 전화번호 부분 정렬을 바꾼다.
                    tmp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tmp;
                }
            }
        }
    }
}
