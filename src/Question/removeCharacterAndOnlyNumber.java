package Question;

public class removeCharacterAndOnlyNumber {

    public int stringToInt(String s) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result += s.charAt(i);
            }
        }
        int resultInt = Integer.parseInt(result);
        System.out.println("resultInt : " + resultInt);
        return resultInt;
    }

    public void getOnlyNumberFromString(String s) {
        s = s.replaceAll("\\D", "");
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i);
        }
        System.out.println("getOnlyNumberFromString result " + result);
    }

    public static void main(String[] args) {
        removeCharacterAndOnlyNumber cst = new removeCharacterAndOnlyNumber();
        String s = "San123";
        cst.stringToInt(s);
        cst.getOnlyNumberFromString(s);
    }
}


