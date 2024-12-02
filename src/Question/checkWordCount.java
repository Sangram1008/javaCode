package Question;

import java.util.Scanner;

public class checkWordCount {

    Scanner sc = new Scanner(System.in);

    int count = 1;

    public void checkWord() {

        System.out.println("Enter Word ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Word Count = " + count);
    }

    public static void main(String[] args) {
        checkWordCount cw = new checkWordCount();
        cw.checkWord();
    }
}
