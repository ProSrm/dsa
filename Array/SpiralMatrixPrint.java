public class SpiralMatrixPrint {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        spiralmatrixprint(arr);

    }

    public static void spiralmatrixprint(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int rmin = 0, rmax = arr.length - 1;
        int cmin = 0, cmax = arr[0].length - 1;
        int count = 0;
        while (count < m * n) {
            // top boundry
            for (int i = cmin; i <= cmax && count < m * n; i++) {
                System.out.print(arr[rmin][i] + ",");
                count++;
            }
            rmin++;
            // right boundry
            for (int i = rmin; i <= rmax && count < m * n; i++) {
                System.out.print(arr[i][cmax] + ",");
                count++;
            }
            cmax--;
            // bottom boundry
            for (int i = cmax; i >= cmin && count < m * n; i--) {
                System.out.print(arr[rmax][i] + ",");
                count++;
            }
            rmax--;
            // left boundry
            for (int i = rmax; i >= rmin && count < m * n; i--) {
                System.out.print(arr[i][cmin] + ",");
                count++;
            }
            cmin++;
        }

    }
}
