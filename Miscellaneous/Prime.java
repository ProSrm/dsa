import java.util.Scanner;

public class Prime {

    public static boolean prime(int n) {
        if (n == 2)
            return true;
        if (n <= 1 || n % 2 == 0)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean primeEffectiveMehtod(int n){
        if(n==1)
         return false;
        if(n==2 || n==3)
        return true;
        if(n%2==0 ||n%3==0)
         return false;
        for(int i =2; i*i<=n;i++){
            if(n%i==0)
             return false;
        }
        return true;

    }

    public static boolean moreEffectivePrime(int n ){
      if(n==1)
         return false;
        if(n==2 || n==3)
        return true;
        if(n%2==0 ||n%3==0)
         return false;
        for(int i =5; i*i<=n;i=i+6){
            if(n%i==0|| n%(i+2)==0)
             return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not ");
        int n = sc.nextInt();
        // boolean ans = prime(n);
        // boolean ans=primeEffectiveMehtod(n);
        boolean ans=moreEffectivePrime(n);
        System.out.println("Number " + n + " is Prime : " + ans);

    }
}
