import java.util.Arrays;

public class Rotate1Unit {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        int count = 1;
        for(int i= 0 ; i<5 ; i++){
            for(int j = 0; j<5 ; j++){

                arr[i][j] = count++;

            }
        }

        System.out.println(Arrays.deepToString(arr));

        rotate(arr);

        System.out.println(Arrays.deepToString(arr));

    }

    private static void rotate(int[][] arr){

        int top = 0;
        int bottom = arr.length-1;

        int left = 0;
        int right = arr[0].length-1;

        int prev;
        int cur;


        while(left < right && top < bottom) {

            prev = arr[top+1][left];

            for(int i =left ; i<=right ; i++){
                cur = arr[top][i];
                arr[top][i] = prev;
                prev = cur;

            }

            top++;

            for(int i = top; i<=bottom; i++){
                cur= arr[i][right];
                arr[i][right] = prev;
                prev = cur;
            }
            right--;

            for(int i=right;i>=left;i--){
                cur = arr[bottom][i];
                arr[bottom][i] = prev;
                prev = cur;
            }

            bottom--;

            for(int i = bottom ; i>=top ; i--){
                cur = arr[i][left];
                arr[i][left] = prev;
                prev = cur;
            }
            left++;
        }





    }
}
