package E_Olimp;

import java.util.Scanner;

//100
public class Task2163 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        int cem=0;

        for (int i=0;i<str.length();i++){
           char ch= str.charAt(i);
           int a=Character.getNumericValue(ch);
           cem+=a;
        }

        if (cem%3==0){
            System.out.println("YES");
        }else
            System.out.println("NO");

    }
}
