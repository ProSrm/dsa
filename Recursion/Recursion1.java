public class Recursion1 {

    static int check(int n) {

        if (n == 1)
            return 0;
        else
            return 1 + check(n / 2);

    }

    public static void main(String[] args) {

        int res = check(16);
        System.out.println(res);

    }

}
