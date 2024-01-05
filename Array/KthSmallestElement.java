import java.util.Scanner;

public class KthSmallestElement{

    public static int kval(int arr[],int k){
        

         for( int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        return arr[k-1];
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter k th value ");
        int a=sc.nextInt();
        int arr[]=new int []{12, 3, 5, 7, 19};
        int res=kval(arr, a);
        System.out.println("result is : "+res);        
    }
}