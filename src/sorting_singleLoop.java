import java.util.Arrays;

public class sorting_singleLoop {

    public static void main(String[] args) {


        sort(new int[] {9,8,7,6,5,4,1,2,3});
    }
    private static void sort(int[] arr){

        int length = arr.length;
        for(int i =0;i<length-1;i++){

            if(arr[i]>arr[i+1]){
                swap(i,i+1,arr);
                i=-1;
            }



        }
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int j, int i, int[] arr){

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]=temp;

    }

}