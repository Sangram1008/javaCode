package Question;

public class countWordCharaWithoutSpace {

    public int checkWordCount(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {
                count++;
            }
        }
        System.out.println("Count of Value " + count);
        return count;
    }

    public static void main(String args[]) {
        countWordCharaWithoutSpace cw = new countWordCharaWithoutSpace();
        String s = "I am Java  ";
        cw.checkWordCount(s);
    }
}
