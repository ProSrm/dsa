class Recursion3 {

    static int check(int n) {
        if (n == 0)
            return 1;
        else {
            check(n - 1);
            System.out.print(n + " ");
            return 0;
        }

    }

    public static void main(String[] args) {
        check(5);

    }
}