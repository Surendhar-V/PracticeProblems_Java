import java.util.Arrays;
//Selection sort ;
/*

INTUITION - Here in this sorting algrithm , we select the range ( inititally arr.length-1 ) in which the maximum element have to be find
            and swap that with the last element ( arr[range] )
            By doing this , we can obtain the fisrt element in every iteration to be placed in its correct position

 */
public  class selectionsort{
    public static void main(String[] args) {

        int[] arr = {-7,6,-5,4,3,-2,1};
        ss(arr);

    }

    private static void ss(int[] arr) {




        int range = arr.length-1;

        for(int i =0;i<arr.length-1; i++){
        int max = findmax(arr , range);
        swap(arr , max, range);
        range--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int findmax(int[] arr ,  int range){
        int max = 0;
        for(int i = 0; i< range +1; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    private static void swap(int[] arr , int max , int range){

        int temp = arr[max];
        arr[max]=arr[range];
        arr[range]=temp;

    }

}