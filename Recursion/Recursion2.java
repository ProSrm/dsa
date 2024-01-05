public class Recursion2 {

    static int printno(int n) {
        if (n == 1) {
            System.out.print(1);
            return 0;
        } else {
            System.out.print(n + " ");
            printno(n - 1);
        }
        return 0;

    }

    public static void main(String[] args) {
        int res = printno(18);
        // System.out.print(res + " ");
    }

}
