// Java program to move all negative numbers to the 
// beginning and all positive numbers to the end with 
// constant extra space 
public class MoveNegativeNo {
    public static void moveno(int a[]) {
        if (a.length <= 0) {
            System.out.println("all sorted");
        }
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        /*
         * for (int k : a) {
         * System.out.print(a[k] + " ");
         * }
         */
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        moveno(arr);
    }
}
