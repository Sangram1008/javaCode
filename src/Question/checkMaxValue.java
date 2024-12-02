package Question;

public class checkMaxValue {

    public void findMax(int[] a) {

        int b = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }
        System.out.println("Max Value is : " + b);
    }

    public static void main(String[] args) {

        int[] arrayValue = {10, 200, 199, 502, 499, 500, 501};

        checkMaxValue cmv = new checkMaxValue();
        cmv.findMax(arrayValue);
    }
}
