

import java.util.Scanner;

public class LCM {

    public static int lcm(int a, int b) {
        int max, min, result = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        for (int i = 1; i < min * max; i++) {
            if (max % min == 0) {
                return max;

            }
            result = max * i;
            if (result % min == 0 && result % max == 0) {
                return result;
            }
        }
        return result;

    }

    // Efficient solution
    // by formula : a*b=gcd(a,b)*lcm(a,b)

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    public static int lcmm(int a, int b) {
        int gcd = gcd(a, b);
        int res = (a * b) / gcd;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no for finding lcm");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = lcmm(a, b);
        System.out.println("LCM is " + lcm);
    }

}
