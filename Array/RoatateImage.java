/*
 * Image is basically collection of bits which represented by numbers if we 
 * roatate that no then we can easily roatate an image j
 * Prob. statement : Given a square matrix of N*N rotate it by 90 degree in clockwise direction 
 * without using an extra space . 
 */

//  solution make transpose of matrix basically it is the swapping of row and columns
/* so diagonal element remains same just other above part will be swapped . after swapping we get traspose
then we just need to change the sequece of column in that transpose matrix and we done for the day . 
 */
public class RoatateImage {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 16, 17 }
        };
        roatateBY90(arr);
        print(arr);

    }

    public static void print(int arr[][]) {
        for (int a[] : arr) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void roatateBY90(int[][] arr) {

        // step 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // step 2
        int left = 0, right = arr[0].length - 1;
        while (left < right) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }

    }

}
