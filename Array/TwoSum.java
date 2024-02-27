import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 11, 3, 7, 9, 14 };
        int target = 17;
        int ans[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (map.containsKey(val)) {
                ans[0] = map.get(val);
                ans[1] = i;
            }
            map.put(arr[i], i);

        }
        System.out.println(ans[0] + " " + ans[1]);
    }

}
