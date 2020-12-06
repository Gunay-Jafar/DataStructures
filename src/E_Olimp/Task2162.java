package E_Olimp;

import java.util.Scanner;

//100
public class Task2162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String input=str.replace(" ","");

        int oddCount = 0;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                oddCount++;
            }
        }

        if (oddCount == input.length() / 2) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
