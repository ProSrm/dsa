public class Patterns {
    public static void main(String[] args) {
        // 0 th pattern

        /*
        
        *****
        *****
        *****
        *****
        ***** 
        
        */

        /*
         * for (int i = 0; i < 5; i++) {
         * int counter = 1;
         * while (counter < 6) {
         * 
         * System.out.print("*");
         * counter++;
         * }
         * System.out.println();
         * }
         * 
         */

        // first pattern
        /*
        
        *****
        ****
        ***
        **
        * 
        
        */

        /*
         * for (int i = 5; i >= 1; i--) {
         * for (int j = i; j >= 1; j--)
         * System.out.print("*");
         * System.out.println();
         * }
         */

        // 2 nd pattern
        /*  
        
        *
        **
        ***
        ****
        ***** 
        
        */

        /*
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= i; j++)
         * System.out.print("*");
         * System.out.println();
         * }
         */

        // third pattern

        /*  
        
        *
        **
        ***
        ****
        ***** 
        ****
        ***
        **
        * 
        
        */

        /*
         * 
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= i; j++)
         * System.out.print("*");
         * System.out.println();
         * }
         * for (int i = 5; i >= 1; i--) {
         * for (int j = i; j > 1; j--)
         * System.out.print("*");
         * System.out.println();
         * 
         * }
         * 
         */

        // fourth pattern

        /*
        
        *****
        ****
        ***
        **
        * 
        **
        ***
        ****
        ***** 
        
        */

        int k = 5;
        int l = 1;
        for (int i = 1; i < 10; i++) {
            if (i <= 5) {
                for (int j = k; j >= 1; j--)
                    System.out.print("*");
                System.out.println();
                k--;
            }
            if (i > 5) {
                l++;
                for (int j = 1; j <= l; j++)
                    System.out.print("*");
                System.out.println();

            }

        }
    }
}
