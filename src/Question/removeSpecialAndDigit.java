package Question;

public class removeSpecialAndDigit {

    public String removeSpecial(String s) {

        s = s.replaceAll("\\d", " ");

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isAlphabetic(currentChar) || currentChar == ' ') {
                result += s.charAt(i);
            }
        }

        System.out.println("result : " + result);
        return result;
    }

    public static void main(String[] args) {
        String s = "I a1@m J$1a$v$a";
        removeSpecialAndDigit rsd = new removeSpecialAndDigit();
        rsd.removeSpecial(s);
    }
}
