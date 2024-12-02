package Question;

public class sortingArray {

    public void sortArray(int a[]) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                int temp;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("Sort Array : " + a[i]);
        }
    }

    public static void main(String[] args) {

        int[] arrayValue = {101, 21, 22, 19, 121, 12, 1};

        sortingArray c2 = new sortingArray();
        c2.sortArray(arrayValue);
    }
}
