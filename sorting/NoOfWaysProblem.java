public class NoOfWaysProblem {

    public static void main(String[] args) {

        System.out.println(ways(4));

    }

    private static int ways(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        } else {
            return ways(n - 1) + ways(n - 2) + ways(n - 3);
        }
    }
}
