public class SmallestMultiplier {
    public static void main(String[] args) {
        int n = 81000;
        System.out.println(sol(n));
        sol(n);

    }

    public static int sol(int n)  {
        String ans = "";
        for (int div = 9; div >= 2; div--) {
            while (n % div == 0) {
                n = n / div;
                ans = div + ans;
            }
        }
        if (n != 1) {
            return -1;
        }
         else {
            return Integer.parseInt(ans);
        }
    }
}
