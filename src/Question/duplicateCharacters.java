package Question;

public class duplicateCharacters {

    public void duplicateCharactersCount(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1 + i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println("Duplicate Character are : " + s.charAt(j));
                    count++;
                }
            }
        }
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        duplicateCharacters dc = new duplicateCharacters();
        String s = "aabbccddefc";
        dc.duplicateCharactersCount(s);
    }
}
