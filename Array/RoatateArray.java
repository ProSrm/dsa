
//Given an array, the task is to cyclically rotate the array clockwise by one time. 
class RoatateArray {
    static void rotate(int arr[]) {
        int lst = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lst;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate(arr);

    }
}
