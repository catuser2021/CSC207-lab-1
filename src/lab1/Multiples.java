package lab1;
import static java.lang.Math.floorDiv;

public class Multiples {
    static void main() {
        multiples(1000, 3, 5);
    }
    static int multiples(int n, int a, int b) {
        System.out.printf("There are %d multiples of %d and %d multiples of %d strictly under 1000",
                Math.floorDiv(n-1, a), a, Math.floorDiv(n-1, b), b);
        return n;
    }
}
