public class NoOfOccurrence {
    public static int countOccurrence(int arr[],int x,int n){
        int count=0;
        for(int r:arr){
            if(r==x)
                count++;
        }
        
        return count;

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 4;
        int res=countOccurrence(arr,x,n);
        System.out.println(res);
    }
    
} 