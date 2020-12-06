package E_Olimp;

import java.util.Scanner;

//100
public class Task2164 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = scanner.nextInt();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char oldChar = str.charAt(i);
            int numNew = oldChar - count;
            if (numNew<65){
                 numNew=91-(65-numNew);
            }
            char newChar = (char) numNew;
            newStr+=newChar;
        }

        System.out.println(newStr);
    }
}
