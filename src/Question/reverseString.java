package Question;

public class reverseString {

    StringBuilder sb = new StringBuilder();

    public void revStringWithInBuilt(String s) {

        sb.append(s);
        String revResult = sb.reverse().toString();

        System.out.println("Reverse String Result : " + revResult);
    }

    public void withOutInBuilt(String s) {

        String result = " ";

        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }

        System.out.println("Reverse String Result : " + result);
    }

    public static void main(String[] args) {

        String s = "Hello Word";

        reverseString rs = new reverseString();

        rs.revStringWithInBuilt(s);
        rs.withOutInBuilt(s);
    }
}
