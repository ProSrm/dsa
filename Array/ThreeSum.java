import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int a[] = { 7, -6, 3, 8, -1, 8, -11 };
        int target = 0;
        solution(a, target, a.length);
    }

    public static void solution(int a[], int target, int n) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (i == 0 || (a[i] != a[i - 1])) {
                int j = i + 1, k = n - 1;
                int tar = target - a[i];
                while (j < k) {
                    if (a[j] + a[k] == tar) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        // just for skipping if value is duplicate
                        while (j < k && a[j] == a[j + 1])
                            j++;
                        while (j < k && a[k] == a[k - 1])
                            k--;
                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar) {
                        j++;

                    } else {
                        k--;
                    }
                }

            }
        }
    }
}

// it uses two pointer approach to solve above three sum problem as follows :
/*
 * sorting is must for using two pointer approach
 * then define pointers and set new target while substracting from first element
 * int j = i + 1, k = n - 1;
 * int tar = target - a[i];
 * and check conditions while two pointer meets another if value find then print
 * or else increase or
 * decrease pointer as required .
 */