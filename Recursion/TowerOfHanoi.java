public class TowerOfHanoi {

    public static void toh(int n, char from, char to, char aux) {
        if (n == 0)
            return;
        toh(n - 1, from, aux, to);
        System.out.println("move disk " + n + " from " + from + " to " + to);
        toh(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        toh(2, 'A', 'c', 'b');
        // toh(n,from,to,auxilary);

    }

}
