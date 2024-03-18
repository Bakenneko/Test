package Fibonacchi;

public class LoopStatements {
    public static int sumOfFibonacciNumbers(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException("n має бути не від'ємним");
        }

        int sum = 0;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            sum += a;
            int nextFib = a + b;
            a = b;
            b = nextFib;
        }

        return sum;
    }
}
