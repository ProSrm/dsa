import java.util.Scanner;

// using Ucladian algorithm
public class GCD {
    public static int calculateGcd(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    // optimised version of the code using recursion .
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no to find Greates common divisor ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int result = calculateGcd(a, b);
        int result = gcd(a, b);
        System.out.println("Result is " + result);
    }

}
