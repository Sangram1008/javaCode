package Question;

public class checkDuplicateNumberInArray {

    public boolean checkIfNumberIsDuplicate(int[] number) {

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 5}; // true
        // int number[] = {1,2,3,4,5}
        checkDuplicateNumberInArray cdna = new checkDuplicateNumberInArray();
        System.out.println(cdna.checkIfNumberIsDuplicate(number));
    }
}
