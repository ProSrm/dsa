/* Given an array arr[]of non-negative integers and an integer sum,
find a subarray that adds to a given sum.
Note:There may be more than one subarray with sum as the given sum,print first such subarray.
Examples:
Input:arr[]={1,4,20,3,10,5},sum=33 Output:Sum found between indexes 2 and 4
 Explanation:Sum of elements between indices 2 and 4 is 20+3+10=33 */

class SubArrayWithSum {
    public static void sum(int a[], int s) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
                count = a[i];
             if (count == s) {
                System.out.println("Sum found at index " + i);
                return;
            
            for (int j = i + 1; j < a.length; j++) {

                count = count + a[j];
                if (count == s) {
                    System.out.println("sum found form " + i + " to " + j);
                    return;
                }
            }
        }
        System.out.println("sum not found ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };

        int sum = 33;

        sum(arr, sum);
    }

}