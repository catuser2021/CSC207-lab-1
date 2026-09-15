package lab1;

public class Reduce {
    static void main() {
        System.out.printf("Number of steps: %d", reduce(1000));
    }
    protected static Integer reduce(int n) {
        return reduce_helper(n, 1);
    }

    private static int reduce_helper(int n, int steps) {
        if (n == 1) {
            return steps;
        }
        else if (n % 2 == 0) {steps = reduce_helper(n / 2, steps += 1);}
        else if (n % 2 == 1) {steps = reduce_helper(n - 1, steps += 1);}
        return steps;
    }
}
