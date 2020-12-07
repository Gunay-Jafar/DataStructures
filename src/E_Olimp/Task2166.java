package E_Olimp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if (!map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), 1);
            } else {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (!map.containsKey(str2.charAt(i))) {
                System.out.println("NO");
                return;
            } else {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            }
        }

        boolean isAllZero =true;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                isAllZero=false;
            }
        }

        if (isAllZero){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
