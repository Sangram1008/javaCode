package Question;

import java.util.Scanner;

public class removeDuplicate {

    String result = "";
    static Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    public String removeDuplicateChar(String s) {
        for (int i = 0; i < s.length(); i++) {

            String ch = "" + s.charAt(i);
            if (result.contains(ch)) {
                continue;
            }
            result += ch;
        }
        System.out.println("result " + result);
        return result;
    }

    public static void main(String[] args) {

        String s = scanner.nextLine();
        removeDuplicate rd = new removeDuplicate();
        rd.removeDuplicateChar(s);
    }
}
