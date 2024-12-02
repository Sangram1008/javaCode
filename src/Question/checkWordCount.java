package Question;

import java.util.Scanner;
import java.util.logging.Logger;

public class checkWordCount {

    Scanner sc = new Scanner(System.in);
    Logger logger;
    int count = 1;
    public void checkWord() {

        logger.info("Enter Word ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        checkWordCount cw = new checkWordCount();
        cw.checkWord();
    }
}
