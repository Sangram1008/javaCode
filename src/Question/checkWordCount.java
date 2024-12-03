package Question;

import java.util.Scanner;

public class checkWordCount {
    Scanner sc = new Scanner(System.in);
    int count = 1;
    int countValue = 0;

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

    public void checkWordWithTrim(String string) {
        string = string.trim();
        for (int i = 0; i < string.length(); i++) {
            if (!string.isEmpty() && (string.charAt(i) == ' ') || (string.length() - 1 == i)) {
                countValue++;
            }
        }
        System.out.println("countValue : " + countValue);
    }

    public static void main(String[] args) {
        checkWordCount cw = new checkWordCount();
        cw.checkWord();
        String s = "Hellow World  ";
        cw.checkWordWithTrim(s);
    }
}
