/* Given an array you need to find the majority elemets in the array . marjority elements 
defined as the element which is appearing more than n/2 times. in the array of length n . 
note : if no majority elements then return -1
 */

/* 
approaches : 1) brute force approach 
2) using hashmap store count of each element occurencec it reduces complexity to O(n)
3)Moore's voting algorithm : basically the difference between votes 
select candidate/element vote for him when other element came decrease vote if vote is 0 then declare new candidate which is current visited 
if same candidate came then increase vote . and repeat the process until it reaches end point  . . . . . . .
*/

public class MajorityElemetns {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 4, 7, 4, 4, 5, 4, 4, 7, 4, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        System.out.println(majority_elem(arr, arr.length));

    }

    public static int majority_elem(int arr[], int n) {
        int candidate = arr[0];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate)
                count++;
            else
                count--;
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        count = 0;
        for (int val : arr) {
            if (val == candidate)
                count++;
        }
        if (n / 2 < count)
            return candidate;
        else
            return -1;

    }
}
