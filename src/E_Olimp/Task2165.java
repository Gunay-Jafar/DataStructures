package E_Olimp;

import java.util.Scanner;

public class Task2165 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String old =scanner.nextLine();
        String input = old.trim();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ' && input.charAt(i - 1) == ' ') {
                continue;
            }

            System.out.print(ch);
        }

    }
}
