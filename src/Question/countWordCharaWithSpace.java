package Question;

public class countWordCharaWithSpace {

    public int checkWordCount(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println("Count Value : " + count);

        return count;
    }

    public static void main(String[] args) {
        countWordCharaWithSpace cw = new countWordCharaWithSpace();
        String s = "I am Java";
        cw.checkWordCount(s);
    }
}
