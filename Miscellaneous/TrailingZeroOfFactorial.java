import java.util.Scanner;

public class TrailingZeroOfFactorial {
    public static void main(String[] args) {
        int n, output, f = 1;
        int count = 0;
        System.out.println("Enter no to calculate it's factorial Trailing zeros ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n > 25) {
            count = n / 25;
        }
        for (int i = 1; i <= n / 5; i++) {
            f = count + (n / 5);
        }
        System.out.println("Trailing zeros of " + n + " factorial is " + f);
    }

}
// optimize solution.
// function to calculate trailing zeros is :
/*
 * public int countTrailingZero(int n){
 * int res;
 * for(int i=5;i<=n;i=i*5){
 * res=n/i;
 * }
 * return res;
 * }
 */