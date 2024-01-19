public class MissingNo {
    static int missing(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += i;

        return ((n * (n + 1)) / 2 - sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = arr.length;
        int res = missing(arr, n);
        System.out.println(res);
    }
}
