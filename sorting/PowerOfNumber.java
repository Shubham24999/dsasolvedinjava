public class PowerOfNumber {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        System.out.println(power(a, b));

    }

    private static int power(int a, int b) {

        if (b == 0) {
            return 0;

        }

        if (b == 1) {
            return a;
        } else {
            return a * power(a, b - 1);
        }

    }

}
