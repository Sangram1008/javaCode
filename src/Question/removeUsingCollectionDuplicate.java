package Question;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeUsingCollectionDuplicate {

    static Scanner scanner = new Scanner(System.in);
    Set set = new LinkedHashSet();
    StringBuilder sb = new StringBuilder();

    public void removeUsing(String s) {

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (Object ch : set) {
            sb.append(ch);
        }
        System.out.println("Remove Duplicate : " + sb);
    }

    public static void main(String[] args) {
        String s = scanner.nextLine();
        removeUsingCollectionDuplicate ruc = new removeUsingCollectionDuplicate();
        ruc.removeUsing(s);
    }
}
