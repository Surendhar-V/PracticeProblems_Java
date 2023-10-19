public class spiralMatrix {

    public static void main(String[] args) {


        int[][] arr = {
                      {1,2,3,4,5},
                      {16,17,18,19,6},
                      {15,24,25,20,7},
                      {14,23,22,21,8},
                      {13,12,11,10,9},
                    };



        printSpiral(arr);

    }


    public static void printSpiral(int[][] arr ){

        int n = arr.length-1;
        int m = arr[0].length-1;

        int p = 0;
        int q = 0;

        int r = m;
        int s = n;

        while(p <= r && q<=s) {
            for (int i = p; i <= r; i++) {
                System.out.print(arr[q][i] + " ");
            }

            q++;

            for (int j = q; j <= s; j++) {
                System.out.print(arr[j][r] + " ");
            }

            r--;

            for (int k = r; k >= p; k--) {
                System.out.print(arr[s][k] + " ");
            }

            s--;

            for (int l = s; l >= q; l--) {
                System.out.print(arr[l][p] + " ");
            }

            p++;
        }


    }

}
