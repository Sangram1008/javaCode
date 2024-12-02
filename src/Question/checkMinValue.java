package Question;

public class checkMinValue {

    public void checkMin(int a[]) {

        int b = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b) {
                b = a[i];
            }
        }

        System.out.println("Min Value is : " + b);
    }

    public static void main(String[] args) {

        int[] arrayValue = {101, 21, 22, 19, 121, 12, 1};

        checkMinValue cmv = new checkMinValue();

        cmv.checkMin(arrayValue);
    }
}
