package Section3;

import java.io.*;
import java.util.Scanner;

public class Code23 {
    static String [] words = new String [100000];
    static  int [] count = new int [100000];
    static int n =0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.println("$ ");
            String command = kb.next();
            if( command.equals("read")){
                String fileName = kb.next();
                makeIndex(fileName);
            }else if(command.equals("filnd")){
                String str = kb.next();
                int index = findWord(str);
                if(index>-1){
                    System.out.println("the word " +words[index] + "appears" + count[index] + "times.");

                }else
                    System.out.println("the word " + str + "does not appear.");
            }else if(command.equals("saveas")){
                String fileName = kb.next();
                saveAs(fileName);
            }else if( command.equals("exit"))
                break;;
        }
        kb.close();
    }
    static  void  saveAs(String fileName){
        PrintWriter outFile;
        try{
            outFile = new PrintWriter(new FileWriter(fileName));
            for (int i=0; i<n; i++)
                outFile.println(words[i] + " " +count[i]);
            outFile.close();
        }catch  (IOException e){
            System.out.println("save failed......");
            return;
        }
    }
    static void makeIndex ( String fileName){
        try{
            Scanner inFile = new Scanner( new File(fileName));
            while (inFile.hasNext()){
                String str = inFile.next();
                String trimmed = trimming(str);
                if(trimmed !=null){
                    String t = trimmed.toLowerCase();
                    addWord(t);
                }

            }
            inFile.close();
        }catch (FileNotFoundException e){
            System.out.println("No file..");
            return;
        }
    }
    static String trimming(String str){
        int i =0, j =str.length()-1;
        while( i<str.length() && !Character.isLetter(str.charAt(i)))
        i++;
        while( j>=0 && !Character.isLetter(str.charAt(j)))
            j--;

        if(i>j)
            return null;
        return str.substring(i,j+1);
    }
    static void addWord(String str){
        int index = findWord(str);
        if( index != -1){
            count[index]++;
        }else {
            int i = n-1;
            while(i>=0 && words[i].compareTo(str)>0){
                words[i+1] = words[i];
                count[i+1] = count[i];
                    i--;
            }
            words[i+1] =str;
            count[i+1] = 1;
            n++;
        }
    }
    static int findWord(String str){
        for (int i=0; i<n; i++)
            if(words[i].equals(str))
                return i;
        return -1;
    }
}
